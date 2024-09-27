package Prova_B.Ex05

//Crie uma classe base FormaGeometrica com os atributos cor e area.
//Crie subclasses Circulo e Retangulo, adicionando atributos específicos e sobrescrevendo o metodo calcularArea().
//Crie uma lista de objetos FormaGeometrica e calcule a área total de todas as formas.

fun main() {
    val formas = listOf(
        Circulo        ("Vermelho",        2.0),
        Retangulo   ("Azul",          3.0, 4.0),
        Circulo        ("Verde",               1.5),
        Retangulo   ("Amarelo",     5.0, 2.0)
    )
    for (forma in formas) {
        println("Área do ${forma::class.simpleName} ${forma.cor} = ${forma.calcularArea()}")
    }
    val areaTotal = formas.sumOf { it.calcularArea() }
    println("\nA soma de todas as áreas das formas é: $areaTotal")
}