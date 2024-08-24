class ContaBancaria(
    val cliente: String,
    var saldo: Double,
    val numero: Int,
    val agencia: Int
) {

    fun depositar(valor: Double) {
        saldo += valor
        println("Depósito de $valor realizado com sucesso.")
    }

    fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
            println("Saque de $valor realizado com sucesso.")
        } else {
            println("Saldo insuficiente para realizar o saque.")
        }
    }

    fun transferir(valor: Double, contaDestino: ContaBancaria) {
        if (valor <= saldo) {
            saldo -= valor
            contaDestino.depositar(valor)
            println("Transferência de $valor realizada com sucesso para a conta ${contaDestino.numero}.")
        } else {
            println("Saldo insuficiente para realizar a transferência.")
        }
    }

    fun imprimirExtrato() {
        println("\n\n----- Extrato Bancário -----")
        println("Cliente: $cliente")
        println("Número da conta: $numero")
        println("Agência: $agencia")
        println("Saldo: R$$saldo")
        println("-------------------------")
    }
}


fun main() {

    val pessoa_01 = ContaBancaria("Leonardo", 1100.0, 12345, 6789)
    val pessoa_02 = ContaBancaria("Thiago", 500.0, 678910, 5050)

    pessoa_01.depositar(1000.0)
    pessoa_01.sacar(250.0)
    pessoa_01.transferir(350.0,pessoa_02)
    pessoa_01.imprimirExtrato()
    pessoa_02.imprimirExtrato()
}