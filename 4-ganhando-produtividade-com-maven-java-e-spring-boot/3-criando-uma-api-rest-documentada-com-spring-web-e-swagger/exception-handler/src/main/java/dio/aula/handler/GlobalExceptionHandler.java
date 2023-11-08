package dio.aula.handler;

import javax.annotation.Resource;
import org.springframework.cglib.proxy.UndeclaredThrowableException;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

// https://glysns.gitbook.io/spring-framework/spring-web/exception-handlers
// Exception Handler: manipulador de exceção é o código que estipula o que um programa fará quando um evento anômalo.
// 1) @ExceptionHandler no nível do @Controller , onde cada método trata uma exceção de forma declatativa com @ExceptionHandler
// 2) ResponseStatusExceptionResolver: notação @ResponseStatus disponível usada em exceções personalizadas e mapear essas exceções para códigos de status HTTP
// 3) RestControllerAdvice: @ExceptionHandler global, com a  anotação @ControllerAdvice. A anotação @ControllerAdvice nos permite consolidar nossos múltiplos @ExceptionHandlers, espalhados antes em um único componente global de tratamento de erros.
// 	 - Controle total sobre o corpo da resposta, bem como o código de status.
//   - Fornece o mapeamento de várias exceções ao mesmo método, para serem tratadas em conjunto.
// 	 - Faz bom uso da resposta RESTful ResposeEntity mais recente .

// No exemplo GlobalExceptionHandler:
// configurar um tratamento de exceções global, para interceptar todas as exceções que ocorrem em nossa aplicação, sem precisar tornar declarativo em todos os recursos.
// atravpes da mensagem cusomizada da classe ResponseError

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @Resource
    private MessageSource messageSource;
    private HttpHeaders headers(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
    private ResponseError responseError(String message,HttpStatus statusCode){
        ResponseError responseError = new ResponseError();
        responseError.setStatus("error");
        responseError.setError(message);
        responseError.setStatusCode(statusCode.value());
        return responseError;
    }
    @ExceptionHandler(Exception.class)
    private ResponseEntity<Object> handleGeneral(Exception e, WebRequest request) {
        if (e.getClass().isAssignableFrom(UndeclaredThrowableException.class)) {
            UndeclaredThrowableException exception = (UndeclaredThrowableException) e;
            return handleBusinessException((BusinessException) exception.getUndeclaredThrowable(), request);
        } else {
            String message = messageSource.getMessage("error.server", new Object[]{e.getMessage()}, null);
            ResponseError error = responseError(message,HttpStatus.INTERNAL_SERVER_ERROR);
            return handleExceptionInternal(e, error, headers(), HttpStatus.INTERNAL_SERVER_ERROR, request);
        }
    }
    @ExceptionHandler({BusinessException.class})
    private ResponseEntity<Object> handleBusinessException(BusinessException e, WebRequest request) {
        ResponseError error = responseError(e.getMessage(),HttpStatus.CONFLICT);
        return handleExceptionInternal(e, error, headers(), HttpStatus.CONFLICT, request);
    }
}
