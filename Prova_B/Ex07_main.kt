package Prova_B

//Crie uma lista de objetos de uma classe personalizada representando pessoas com nome, idade e altura.
// Ordene essa lista por:
//Nome em ordem alfabética.
//Idade em ordem crescente, considerando a altura como critério de desempate.
//Altura em ordem decrescente.

class Pessoa(val nome: String, val idade: Int, val altura: Double)

fun main() {

    val pessoas = listOf(
        Pessoa("Ana    ",    25, 1.76),
        Pessoa("Bruno  ",   50, 1.75),
        Pessoa("Carlos ",    20, 1.82),
        Pessoa("Diana  ",    25, 1.73),
        Pessoa("Eduardo",  30, 1.69)
    )

    // Ordenar por altura em ordem decrescente
    val ordenadoPorAltura = pessoas.sortedByDescending { it.altura }
    println("-- Ordenado por altura (decrescente)\n")
    ordenadoPorAltura.forEach { println("${it.nome} - Altura: ${it.altura}   Idade: ${it.idade}") }


    // Ordenar por idade em ordem crescente, considerando a altura como critério de desempate
    val ordenadoPorIdadeAltura = pessoas.sortedWith(compareBy({ it.idade }, { it.altura }))
    println("\n-- Ordenado por idade (crescente) e altura (desempate)\n")
    ordenadoPorIdadeAltura.forEach { println("${it.nome} - Idade: ${it.idade}   Altura: ${it.altura}") }


    // Ordenar por nome em ordem alfabética
    val ordenadoPorNome = pessoas.sortedBy { it.nome }
    println("\n-- Ordenado por nome (alfabética)\n")
    ordenadoPorNome.forEach {  println("${it.nome} - Idade: ${it.idade}   Altura: ${it.altura}") }
}