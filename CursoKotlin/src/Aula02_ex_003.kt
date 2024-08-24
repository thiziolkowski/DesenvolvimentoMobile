class Data(val dia: Int, val mes: Int, val ano: Int) {
    fun imprimirData() {
        println("\n>> ${dia.toString().padStart(2, '0')}" +
                "/${mes.toString().padStart(2, '0')}" +
                "/$ano")
    }
}


fun main() {
    val data1 = Data(23, 8, 2024)
    val data2 = Data(30, 8, 2024)

    data1.imprimirData()
    data2.imprimirData()
}