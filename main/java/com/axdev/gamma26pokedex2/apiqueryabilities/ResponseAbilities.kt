package com.axdev.gamma26pokedex2.apiqueryabilities

/**
 * Created by HachaDev 23/06/24
 */

import com.axdev.gamma26pokedex2.apiobjects.EffectEntries

data class ResponseAbilities (
    val name: String,
    val effect_entries: List<EffectEntries>

)