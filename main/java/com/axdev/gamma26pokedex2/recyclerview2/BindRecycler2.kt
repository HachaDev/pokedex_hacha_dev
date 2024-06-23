package com.axdev.gamma26pokedex2.recyclerview2

/**
 * Created by HachaDev 23/06/24
 */

import com.axdev.gamma26pokedex2.apiobjects.Sprites
import com.axdev.gamma26pokedex2.recyclerview2.Provider2.Companion.spritesList

class BindRecycler2 {
    fun clearList (){
        spritesList.clear()
    }
    fun onBindList (sprites: Sprites) {
        if (sprites.front_default!= null){
            spritesList.add(sprites.front_default)
        }
        if (sprites.back_default!= null){
            spritesList.add(sprites.back_default)
        }
        if (sprites.back_shiny!= null){
            spritesList.add(sprites.back_shiny)
        }
        if (sprites.front_shiny!= null){
            spritesList.add(sprites.front_shiny)
        }
        if (sprites.front_female!= null){
            spritesList.add(sprites.front_female)
        }
        if (sprites.back_female!= null){
            spritesList.add(sprites.back_female)
        }
        if (sprites.front_shiny_female!= null){
            spritesList.add(sprites.front_shiny_female)
        }
        if (sprites.back_shiny_female!= null){
            spritesList.add(sprites.back_shiny_female)
        }
    }
}