package dio.expertostech.tutorial.rest.kafka.services;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

// @RequiredArgsConstructor cria um contrutor para o evento, ou seja, injeta o evento.
@Service
@RequiredArgsConstructor
public class RegistraEventoService {

    private final KafkaTemplate<Object, Object> template;
    
    // <T> método genérico que aceita qualquer tipo de componente
    public <T> void adicionarEvento(String topico, T dados) {
        template.send(topico, dados);
    }
    
    // em vez de colocar o contrutor, Lombok permite realizar o uso da anotação "@RequiredArgsConstructor"
//    public RegistraEventoService(KafkaTemplate<Object, Object> template) {
//    	this.template = template;
//    }

}
