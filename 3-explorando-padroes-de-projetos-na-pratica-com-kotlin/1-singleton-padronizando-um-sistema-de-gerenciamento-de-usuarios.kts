class User(val id: Int, val name: String)

object UserManager {

  private val users = mutableListOf<User>()

  fun addUser(name: String) {
    //TODO: Inplementar a lógica de adicionar um novo Usuário na lista "users".
    //Dica: Utilize o tamanho da lista "users" para gerar seus IDs.
    val id = users.size + 1
    val user = User(id, name)
    
    users.add(user)
    
  }

  fun listUsers() {
    
    for(user in users) {
      //TODO: Inplementar a impressão/listagem dos "users", seguindo o padrão definido no enunciado.
      println("${user.id} - ${user.name}")     

    }
    
  }
  
}

fun main() {
  val quantity = readLine()?.toIntOrNull()?:0

  for (i in 1..quantity) {
    val name = readLine()?:""
    UserManager.addUser(name)
  }

  UserManager.listUsers()
}


