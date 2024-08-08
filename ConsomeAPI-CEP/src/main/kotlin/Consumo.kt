package br.edu.fatecpg

import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers


class Consumo {
    fun buscaEndereco(cep: String):Endereco?{
        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create("https://viacep.com.br/ws/$cep/json/"))
            .build()

        val response = client
            .send(request, BodyHandlers.ofString())

//indica que a requisição foi bem-sucedida e o servidor retornou o conteúdo solicitado
        if (response.statusCode() == 200) {
            val gson = Gson()
            return gson.fromJson(response.body(), Endereco::class.java)
        }

        return null
    }
}