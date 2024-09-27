package Prova_B.Ex06

class Pessoa(val nome: String, val idade: Int) : Comparable<Pessoa> {

    override fun compareTo(other: Pessoa): Int {
        return this.idade - other.idade
    }

    override fun toString(): String {
        return "Pessoa(nome='$nome', idade=$idade)"
    }
}
