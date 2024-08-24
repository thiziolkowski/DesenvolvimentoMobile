class Lampada {
    private var estado: Boolean = false // false = apagada, true = acesa
    private var contadorCiclos: Int = 0
    private val LIMITE_CICLOS = 5

    fun acender() {
        if (contadorCiclos == LIMITE_CICLOS) {
            println("\n>> A lâmpada queimou!\n")
            return
        }
        estado = true
 //       contadorCiclos++
        println("A lâmpada foi acendida.")
    }

    fun apagar() {
        estado = false
        contadorCiclos++
        println("A lâmpada foi apagada.")
    }

    fun getEstado(): Boolean {
        return estado
    }
}

fun main() {
    val lampada1 = Lampada()
    val lampada2 = Lampada()

    lampada1.acender()
    lampada1.apagar()
    lampada1.acender()
    lampada1.apagar()
    lampada1.acender()
    lampada1.apagar()
    lampada1.acender()
    lampada1.apagar()
    lampada1.acender()
    lampada1.apagar()
    lampada1.acender()


    lampada2.acender()
    lampada2.apagar()
    lampada2.acender()
    lampada2.apagar()
    lampada2.acender()
    lampada2.apagar()
    lampada2.acender()
    lampada2.apagar()
    lampada2.acender()
    lampada2.apagar()
    lampada2.acender()




}