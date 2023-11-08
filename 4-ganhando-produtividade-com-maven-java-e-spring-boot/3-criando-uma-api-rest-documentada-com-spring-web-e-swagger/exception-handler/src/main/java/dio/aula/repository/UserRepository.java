package dio.aula.repository;

import dio.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    //Query Method
    List<User> findByNameContaining(String name);

    //Query Method
    User findByUsername(String username);

    //Query Override
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);
}

//public class UsuarioRepository {
//	    // exemplo de aplicabilidade ao se cirar sua própria classe de exceção "CampoObrigatorioException"
//	    // classe que salva ou atualiza um usuário, seguindo o exemplo anterior
//	    public void save(User usuario) {
//	    	if(usuario.getPassword()==null)
//	    		throw new CampoObrigatorioException("password");
//	    	
//	    	if(usuario.getId()==null)
//	    		System.out.println("SAVE - Recebendo o usuário na camada de repositório");
//	    	else
//	    		System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
//	    }
//	}
//}
