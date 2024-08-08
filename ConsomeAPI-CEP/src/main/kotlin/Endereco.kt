package br.edu.fatecpg

import com.google.gson.annotations.SerializedName

data class Endereco(@SerializedName("cep") val cep:String,
                    @SerializedName("logradouro") val rua:String,
                    @SerializedName("bairro") val bairro:String,
                    @SerializedName("localidade") val cidade:String,
                    @SerializedName("uf") val estado:String)
{
//Sobrevendo o metodo toString() para criar uma representação em string personalizada do Endereco.
//Isso permite que, quando o objeto for impresso (ex. usando println na Main), ele exiba uma mensagem
//formatada com todos os detalhes do endereço.
    override fun toString(): String {
        return "CEP: $cep " +
                "\nRua: $rua " +
                "\nBairro: $bairro " +
                "\nLocalidade: $cidade " +
                "\nUF: ${estado}"
    }
}
