package dio.aula.handler;

public class BusinessException extends RuntimeException {
    public BusinessException(String mensagem) {
        super(mensagem);
    }
    // "..." ou varargs significa que a classe pode receber receber um número variável de argumentos do mesmo tipo.
    public BusinessException(String mensagem, Object ... params) {
        super(String.format(mensagem, params));
    }
}
