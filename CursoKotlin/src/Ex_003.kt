fun main() {

    println("\nEscreva um programa que leia dois números inteiros e imprima o maior deles.\n")

    print(">> Informe o 1º número: ")
    val n1 = readLine()!!.toInt()

    print(">> Informe o 2º número: ")
    val n2 = readLine()!!.toInt()

    val maior = if (n1 > n2 ) n1 else n2

    println("\n>> Maior numero entre: $n1 e $n2 é >>> $maior \n")



}