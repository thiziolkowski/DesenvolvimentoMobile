package Prova_B

//Escreva um programa que leia o nome de um arquivo e tente abri-lo para leitura.
//Utilize um bloco try-catch para capturar a exceção FileNotFoundException caso o arquivo não seja encontrado.
//Implemente um mecanismo de reentrada para que o usuário possa informar um novo nome de arquivo.

import java.io.File
import java.io.FileNotFoundException

fun main() {
    var arquivoAberto = false

    while (!arquivoAberto) {
        // Solicita ao usuário que insira o nome do arquivo
        print("Digite o nome do arquivo que deseja abrir: ")
        val nomeArquivo = readLine()

        try {
            // Tentativa de abrir o arquivo
            val arquivo = File(nomeArquivo)
            val conteudo = arquivo.readText()
            println("Arquivo aberto com sucesso!\nConteúdo do arquivo:")
            println(conteudo)

            // Sinaliza que o arquivo foi aberto com sucesso
            arquivoAberto = true
        } catch (e: FileNotFoundException) {
            // Captura a exceção se o arquivo não for encontrado
            println("Arquivo não encontrado. Por favor, tente novamente.")
        }
    }
}
