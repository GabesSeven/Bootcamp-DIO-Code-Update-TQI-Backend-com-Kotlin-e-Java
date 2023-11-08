package dio.expertostech.tutorial.microsservico.kafka.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dio.expertostech.tutorial.microsservico.kafka.data.PedidoData;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

// @Slf4j cria registros de log para os consumidores
// @Slf4j que cria a variável "log"
@Slf4j
@Service
public class SalvarPedidoService {
	// groupId seria o código da aplicação, se outra aplicação quiser receber os mesmos dados, é necessário mudar o ID para o programa criar um cópia separada dos dados
    @KafkaListener(topics = "SalvarPedido", groupId = "MicrosservicoSalvaPedido")
    private void executar(ConsumerRecord<String, String> record) {

        log.info("Chave = {}", record.key());
        log.info("Cabecalho = {}", record.headers());
        log.info("Particao = {}", record.partition());

        String strDados = record.value();

        ObjectMapper mapper = new ObjectMapper();
        PedidoData pedido;

        try {
            pedido = mapper.readValue(strDados, PedidoData.class);
        } catch (JsonProcessingException ex) {
            log.error("Falha converter evento [dado={}}]", strDados, ex);
            return;
        }

        log.info("Evento Recebido = {}", pedido);

        // Gravar no banco de dados
        // Responder para a fila de que o pedido foi salvo
    }

    private void gravar(PedidoData pedido) {
        // Gravar no banco de dados
    }



}
