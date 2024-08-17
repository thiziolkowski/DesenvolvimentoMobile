fun main() {

    println("\nEscreva um programa que leia as dimensões de um retângulo e calcule a área e o perímetro.\n")

    print(">> Informe a largura: ")
    val larg = readLine()!!.toDouble()

    print(">> Informe a altura: ")
    val alt = readLine()!!.toDouble()

    val area = (larg * alt)
    val perimetro = (larg * alt) * 2

    println("\n    Area do Retangulo: $area ")
    println("Perimetro do Retangulo: $perimetro ")

}


