package com.axdev.gamma26pokedex2.apiquerypokemon

/**
 * Created by HachaDev 23/06/24
 */

import com.axdev.gamma26pokedex2.apiobjects.Abilities
import com.axdev.gamma26pokedex2.apiobjects.Cries
import com.axdev.gamma26pokedex2.apiobjects.Held_Items
import com.google.gson.annotations.SerializedName
import com.axdev.gamma26pokedex2.apiobjects.Sprites
import com.axdev.gamma26pokedex2.apiobjects.Stats
import com.axdev.gamma26pokedex2.apiobjects.Moves
import com.axdev.gamma26pokedex2.apiobjects.Types



data class ResponsePokemon (
    @SerializedName("name") var name: String,
    @SerializedName("moves") var moves: List<Moves>,
    @SerializedName("stats") var stats: List<Stats>,
    @SerializedName("abilities") var abilities: List<Abilities>,
    @SerializedName("base_experience") var base_experience: Int,
    @SerializedName("id") var id: String,
    @SerializedName("cries") var cries: Cries,
    @SerializedName("height") var height: Int,
    @SerializedName("weight") var weight: Int,
    @SerializedName("sprites") var sprites: Sprites,
    @SerializedName("types") var types: List<Types>,
    @SerializedName("order") var order: Int,
    @SerializedName("held_items") var held_items: List<Held_Items>,
    @SerializedName("forms") var forms: List<Any>,
    @SerializedName("is_default") var is_default: Boolean,
    @SerializedName("location_area_encounters") var location_area_encounters: String)
