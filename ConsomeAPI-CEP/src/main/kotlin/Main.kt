package br.edu.fatecpg

import com.google.gson.Gson


fun main() {
    val consumo = Consumo() // Cria uma instância de Consumo
    println("Digite o CEP:")
    val cep = readLine() ?: return
    val endereco = consumo.buscaEndereco(cep) // Chama a função através da instância

    if (endereco != null) {
        println(endereco)
    } else {
        println("Endereço não encontrado.")
    }
}