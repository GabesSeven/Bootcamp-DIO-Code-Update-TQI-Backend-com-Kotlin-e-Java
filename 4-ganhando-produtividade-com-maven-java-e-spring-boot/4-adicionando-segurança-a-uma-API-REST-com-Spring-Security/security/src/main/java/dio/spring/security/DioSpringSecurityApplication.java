package dio.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// https://glysns.gitbook.io/spring-framework/spring-security/untitled
// Terminologias, habilitando as dependências de segurança

// https://glysns.gitbook.io/spring-framework/spring-security/autenticacao-simples
// o Spring Security possui uma autenticação padrão que gera senha a cada instância
// Caso coloque credências no arquivo "application.properites" (spring.security.user.name, spring.security.user.password, spring.security.user.roles) esse padrão é retirado e o que cont são esses usuários cadastrados temporiariamente
// Congiguração de credenciais em memória permite criar uma lista de usuários para mostrar o projeto ao público externo

@SpringBootApplication
public class DioSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioSpringSecurityApplication.class, args);
	}

}
