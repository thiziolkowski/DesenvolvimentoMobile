fun main() {

    println("\nEscreva um programa que leia um número entre 1 e 7 " +
            "correspondendo a um dia da semana, sendo domingo o primeiro dia," +
            " e imprima o nome do dia da semana. Utilize o comando WHEN\n")

    print(">> Informe um valor: ")
    val num = readLine()!!.toInt()

    if (num > 7 || num < 1 ) println("Digite um número válido entre 1 e 7")else{
        when(num){
            1 -> println("\n Domingo   \n")
            2 -> println("\n Segunda   \n")
            3 -> println("\n Terça   \n")
            4 -> println("\n Quarta   \n")
            5 -> println("\n Quinta   \n")
            6 -> println("\n Sexta   \n")
            7 -> println("\n Sabado   \n")
        }
    }
}