package com.axdev.gamma26pokedex2.recyclerview1

/**
 * Created by HachaDev 23/06/24
 */

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.axdev.gamma26pokedex2.R

class Adapter1(private val pokeList: MutableList<Recycler1Object>,
               private val onclickListener: (Recycler1Object) -> Unit
) : RecyclerView.Adapter<ViewHolder1>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder1(layoutInflater.inflate(
            R.layout.item_recyclerview1
            , parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
        val item = pokeList[position]
        holder.render(item,onclickListener)
    }

    override fun getItemCount(): Int {
        return pokeList.size
    }
}