package com.axdev.gamma26pokedex2.recyclerview5

/**
 * Created by HachaDev 23/06/24
 */

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.axdev.gamma26pokedex2.R
import com.axdev.gamma26pokedex2.apiobjects.Stats

class Adapter5 (private val recycler5List: MutableList<Stats>,
                private val onclickListener: (Stats) -> Unit
) : RecyclerView.Adapter<ViewHolder5>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder5 {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder5(layoutInflater.inflate(
            R.layout.item_recyclerview5
            , parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder5, position: Int) {
        val item = recycler5List[position]
        holder.render(item,onclickListener)
    }

    override fun getItemCount(): Int {
        return recycler5List.size
    }
}