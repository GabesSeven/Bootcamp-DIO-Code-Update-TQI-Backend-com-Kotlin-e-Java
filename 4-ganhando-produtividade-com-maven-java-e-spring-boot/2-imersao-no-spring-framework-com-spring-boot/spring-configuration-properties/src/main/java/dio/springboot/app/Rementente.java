package dio.springboot.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
//@Configuration está associado a todo ambiente do "application.properties"
// "application.properties" trás segurança para a aplicação nos casos de envio de e-mail, autenticação, sessão com servidor FTP, entre outros
@Configuration
@ConfigurationProperties(prefix = "remetente")
public class Rementente {
    private String nome;
    private String email;
    private List<Long> telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }
}
