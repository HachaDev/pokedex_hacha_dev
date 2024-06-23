package com.axdev.gamma26pokedex2.recyclerview2

/**
 * Created by HachaDev 23/06/24
 */

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.axdev.gamma26pokedex2.R

class Adapter2 (private val spritesList: MutableList<String>,
                private val onclickListener: (String) -> Unit
) : RecyclerView.Adapter<ViewHolder2>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder2 {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder2(layoutInflater.inflate(
            R.layout.item_recyclerview2
            , parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder2, position: Int) {
        val item = spritesList[position]
        holder.render(item,onclickListener)
    }

    override fun getItemCount(): Int {
        return spritesList.size
    }
}