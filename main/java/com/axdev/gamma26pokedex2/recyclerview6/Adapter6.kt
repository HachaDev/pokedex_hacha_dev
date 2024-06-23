package com.axdev.gamma26pokedex2.recyclerview6

/**
 * Created by HachaDev 23/06/24
 */

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.axdev.gamma26pokedex2.R
import com.axdev.gamma26pokedex2.apiqueryhelditems.ResponseHeldItems

class Adapter6 (private val recycler6List: MutableList<ResponseHeldItems>,
                private val onclickListener: (ResponseHeldItems) -> Unit
) : RecyclerView.Adapter<ViewHolder6>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder6 {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder6(layoutInflater.inflate(
            R.layout.item_recyclerview6
            , parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder6, position: Int) {
        val item = recycler6List[position]
        holder.render(item,onclickListener)
    }

    override fun getItemCount(): Int {
        return recycler6List.size
    }
}