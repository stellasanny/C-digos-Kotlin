fun main() {
    //função= fun, mein= principal. Função principal
    val nomes = listOf("João", "Maria", "Lucas")
    //val= variação de nomes, listOf= lista de nomes
    val sobrenomes = listOf("Silva", "Santos", "Oliveira")
    //essa linha a lista dos sobrenomes

    val nome = nomes.random()
    //essa linha ta chamando a outra linha que tem "nome" e vai deixar eles aleatorios
    val sobrenome = sobrenomes.random()
    //aqui também, e vai deixar os sobrenomes aleatorios

    println("Nome completo: $nome $sobrenome")
    //aqui ta printando e vai mostrar o resultado de qual nome ficou e qual sobrenome
} 
