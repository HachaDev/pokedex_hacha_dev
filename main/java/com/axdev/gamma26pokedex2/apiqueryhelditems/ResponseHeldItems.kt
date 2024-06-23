package com.axdev.gamma26pokedex2.apiqueryhelditems

/**
 * Created by HachaDev 23/06/24
 */

import com.axdev.gamma26pokedex2.apiobjects.EffectEntries

data class ResponseHeldItems (
    var name: String,
    var effect_entries: List<EffectEntries>

)