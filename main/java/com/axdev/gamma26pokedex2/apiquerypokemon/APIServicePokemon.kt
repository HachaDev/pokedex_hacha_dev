package com.axdev.gamma26pokedex2.apiquerypokemon

/**
 * Created by HachaDev 23/06/24
 */

import retrofit2.http.GET
import retrofit2.http.Url
// En este Interface vamos a crear una interfaz que lo que hará será definir el tipo de
// consumo de API y lo que nos va a devolver.
import retrofit2.Call
interface APIServicePokemon {
    @GET
    fun getCharacterByName(@Url url:String): Call<ResponsePokemon>
}