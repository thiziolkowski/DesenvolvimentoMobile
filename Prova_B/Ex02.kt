package Prova_B

//Crie um programa que receba um número inteiro como entrada e,
//utilizando a expressão when, imprima uma mensagem diferente para cada um dos seguintes intervalos:

//Menor que 0
//Entre 0 e 10
//Entre 11 e 20
//Maior que 20

fun main() {
    print("Digite um número inteiro: ")
    val numero = readLine()?.toIntOrNull()


    if (numero != null) {

        when {
            numero < 0 -> println("O número é menor que 0.")
            numero in 0..10 -> println("O número está entre 0 e 10.")
            numero in 11..20 -> println("O número está entre 11 e 20.")
            numero > 20 -> println("O número é maior que 20.")
            else -> println("Valor não identificado.")
        }
    } else {
        println("Por favor, insira um número inteiro válido.")
    }
}
