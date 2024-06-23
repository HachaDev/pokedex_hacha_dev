package com.axdev.gamma26pokedex2.recyclerview4

/**
 * Created by HachaDev 23/06/24
 */

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.axdev.gamma26pokedex2.R

class Adapter4 (private val recycler4List: MutableList<String>,
                private val onclickListener: (String) -> Unit
) : RecyclerView.Adapter<ViewHolder4>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder4 {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder4(layoutInflater.inflate(
            R.layout.item_recyclerview4
            , parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder4, position: Int) {
        val item = recycler4List[position]
        holder.render(item,onclickListener)
    }

    override fun getItemCount(): Int {
        return recycler4List.size
    }
}