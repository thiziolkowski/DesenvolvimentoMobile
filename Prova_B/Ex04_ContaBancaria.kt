package Prova_B.Ex04

class ContaBancaria(
    val titular: String,
    val numero: Int,
    var saldo: Double
) {

    //Fazer depósito
    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Depósito de R$%.2f realizado com sucesso. Novo saldo: R$%.2f".format(valor, saldo))
        } else {
            println("Valor de depósito inválido.")
        }
    }

    // Fazer saque
    fun sacar(valor: Double) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor
            println("Saque de R$%.2f realizado com sucesso. Novo saldo: R$%.2f".format(valor, saldo))
        } else if (valor > saldo) {
            println("Saldo insuficiente para saque.")
        } else {
            println("Valor de saque inválido.")
        }
    }

    // Consultar saldo
    fun consultarSaldo() {
        println("O saldo atual da conta é: R$%.2f".format(saldo))
    }
}
