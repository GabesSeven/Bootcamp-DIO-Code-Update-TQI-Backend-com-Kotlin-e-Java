fun main() {
    val titulo = readLine() ?: ""
    val autor = readLine() ?: ""
    
    // Aqui usamos a Extension Function "generateSlug()" nas Strings de Entrada.
    val slugTitulo = titulo.generateSlug()
    val slugAutor = autor.generateSlug()
    
    println("Slug gerado para o livro:")
    //TODO: Formatar/Imprimir as slugs considerando o padrão de saída deste desafio.
    println("$slugTitulo"+"_"+"$slugAutor")
}

fun String.generateSlug(): String {
    // TODO: Lógica para que qualquer String tenha a capacidade de gerar uma slug (seguindo-este-padrao).
    // Substituir espaços por traços (-)
    val slug = this.replace(" ", "-")

    // Remover pontos
    val slugSemPontos = slug.replace(".", "")

    // Remover caracteres especiais exceto letras, números e traços
    val slugSemEspeciais = slugSemPontos.replace(Regex("[^A-Za-z0-9-]"), "")

    // Transformar em letras minúsculas
    return slugSemEspeciais.toLowerCase()
}

