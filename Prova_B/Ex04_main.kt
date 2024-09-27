package Prova_B.Ex04

//Crie uma classe ContaBancaria com os atributos titular, numero e saldo. Implemente métodos para depósito, saque e consulta de saldo.
//Crie um objeto ContaBancaria e realize algumas operações, exibindo as informações da conta após cada operação.

fun main() {

    val conta = ContaBancaria(titular = "Arthur Felipe", numero = 5428, saldo = 1000.0)


    println("Titular: ${conta.titular}")
    println("Número da conta: ${conta.numero}")
    conta.consultarSaldo()

    // Faz um depósito
    conta.depositar(500.0)

    // Faz um saque
    conta.sacar(300.0)

    // Tenta sacar mais do que tem na conta
    conta.sacar(1500.0)

    // Mostra o saldo final
    conta.consultarSaldo()
}
