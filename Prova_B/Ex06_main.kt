package Prova_B.Ex06

//Crie uma interface Comparable com um metodo compareTo(). Crie classes Produto e Pessoa que implementem a interface
//Comparable, permitindo a comparação de produtos por preço e de pessoas por idade.
//Utilize a interface Comparable para ordenar listas de produtos e pessoas.

fun main() {

    val pessoas = listOf(
        Pessoa("João", 25),
        Pessoa("Maria", 32),
        Pessoa("Carlos", 18),
        Pessoa("Ana", 40)
    )


    val produtos = listOf(
        Produto("Notebook", 3000.0),
        Produto("Mouse", 50.0),
        Produto("Teclado", 150.0),
        Produto("Monitor", 1200.0)
    )


    val pessoasOrdenadas = pessoas.sortedBy { it.idade }
    println("Pessoas ordenadas por idade:")
    pessoasOrdenadas.forEach { println(it) }


    val produtosOrdenados = produtos.sortedBy { it.preco }
    println("\nProdutos ordenados por preço:")
    produtosOrdenados.forEach { println(it) }
}
