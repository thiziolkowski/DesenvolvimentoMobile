package Prova_B

//Escreva um programa que solicite ao usuário um número inteiro e um número decimal.
// Converta o número inteiro para decimal e o número decimal para inteiro.
// Imprima os resultados na tela, observando possíveis perdas de precisão.

fun main()
{
    print("Digite um número inteiro: ")
    val inteiro = readln().toInt()

    print("Digite um número decimal: ")
    val decimal = readln().toDouble()
    //convertento input
    val inteiroPARAdecimal = inteiro.toDouble()
    println("Covertendo $inteiro para decimal = $inteiroPARAdecimal")
    val decimalPARAinteiro = decimal.toInt()
    println("Covertendo $decimal para inteiro = $decimalPARAinteiro")
    // processo reverso
    val novoInteiro = inteiroPARAdecimal.toInt()
    println("\nProcesso reverso Novo Inteiro =  $novoInteiro")
    val novoDecimal = decimalPARAinteiro.toDouble()
    println("Processo reverso Novo Decimal =  $novoDecimal")

    // verificando precisão da conversão
    if (inteiro != novoInteiro) {
        println("\nHouve perda ao converter o número inteiro para decimal.")
    }
    if (decimal != novoDecimal) {
        println("\nHouve perda ao converter o número decimal para inteiro.")
    }
}