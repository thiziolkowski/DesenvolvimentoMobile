package Prova_B.Ex05

class Circulo(cor: String, val raio: Double) : FormaGeometrica(cor) {
    override fun calcularArea(): Double {
        return Math.PI * raio * raio
    }
}