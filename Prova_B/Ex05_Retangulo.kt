package Prova_B.Ex05

class Retangulo(cor: String, val largura: Double, val altura: Double) : FormaGeometrica(cor) {
    override fun calcularArea(): Double {
        return largura * altura
    }
}