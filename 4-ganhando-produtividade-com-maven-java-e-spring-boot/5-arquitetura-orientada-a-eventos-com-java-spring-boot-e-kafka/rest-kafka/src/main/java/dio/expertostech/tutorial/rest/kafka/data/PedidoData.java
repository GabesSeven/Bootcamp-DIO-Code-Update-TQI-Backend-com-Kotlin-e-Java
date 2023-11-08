package dio.expertostech.tutorial.rest.kafka.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


// @Data cria todos getters e setters disponíveis para as propriedades codigo, nomeProduto, valor

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoData {

    private String codigo;
    private String nomeProduto;
    private BigDecimal valor;

}
