package Prova_B

//Crie um programa que imprima a tabuada de multiplicação de um número inteiro fornecido pelo usuário.
// Utilize um loop for para iterar pelos multiplicadores de 1 a 10.

fun main() {

    println("****** TABUADA ******")
    print("Informe um nº de 1 a 10: ")
    val numero = readln().toInt()

    // Looping para gerar a tabuada
    println("\n")
    for (i in 1..10)
    {
        val resultado = numero * i
        println("$numero x $i = $resultado")
    }
}