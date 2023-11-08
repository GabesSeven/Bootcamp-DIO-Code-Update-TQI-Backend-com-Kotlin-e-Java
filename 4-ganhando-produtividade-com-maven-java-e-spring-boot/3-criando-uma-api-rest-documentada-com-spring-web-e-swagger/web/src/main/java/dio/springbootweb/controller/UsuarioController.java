package dio.springbootweb.controller;

import dio.springbootweb.model.Usuario;
import dio.springbootweb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// https://glysns.gitbook.io/spring-framework/spring-web/primeiro-controller
// Rest Controller em Spring é um classe contendo anotações específicas para disponibilização de recursos HTTPs baseados em serviços e regras de negócio
// @RestController: Responsável por designar o bean de compoment, que surporta requisições HTTP com base na arquitetura REST.
// @RequestMapping("prefix"): Determina qual a URI comum para todos os recursos disponibilizados pelo Controller.
// @GetMapping: Determina que o método aceitará requisições HTTP do tipo GET.
// @PostMapping: Determina que o método aceitará requisições HTTP do tipo POST.
// @PutMapping: Determina que o método aceitará requisições HTTP do tipo PUT.
// @DeleteMapping: Determina que o método aceitará requisições HTTP do tipo DELETE.
// @RequestBody: Converte um JSON para o tipo do objeto esperado como parâmetro no método.
// @PathVariable: Consegue determinar que parte da URI será composta por parâmetros recebidos nas requisições. 


@RestController
//@RequestMapping('/user/'): posso colocar aqui como rota padrão para os métodos de UsuarioController, assim não precisa colocar "users" nos @PostMapping
public class UsuarioController {
	
	// Não aplicar a lógica de negócio em um @RestController que funciona semelhante a uma proxy 
	// Aplicar a lógica de negócio no repository
    
	@Autowired
    private UsuarioRepository repository;

    @PostMapping("/users")
    public void post(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
    @PutMapping("/users")
    public void put(@RequestBody Usuario usuario){
        repository.update(usuario);
    }
    @GetMapping("/users")
    public List<Usuario> getAll(){
        return repository.listAll();
    }
    @GetMapping("/users/{id}")
    public Usuario getOne(@PathVariable("id") Integer id){
        return repository.finById(id);
    }
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
}
