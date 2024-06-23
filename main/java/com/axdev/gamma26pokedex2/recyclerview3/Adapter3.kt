package com.axdev.gamma26pokedex2.recyclerview3

/**
 * Created by HachaDev 23/06/24
 */

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.axdev.gamma26pokedex2.R
import com.axdev.gamma26pokedex2.apiobjects.Abilities
import com.axdev.gamma26pokedex2.apiqueryabilities.ResponseAbilities

class Adapter3 (private val descriptionList: MutableList<AdapterForListRecycler3>,
                private val onclickListener: (AdapterForListRecycler3) -> Unit
) : RecyclerView.Adapter<ViewHolder3>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder3 {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder3(layoutInflater.inflate(
            R.layout.item_recyclerview3
            , parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder3, position: Int) {
        val item = descriptionList[position]
        holder.render(item,onclickListener)
    }

    override fun getItemCount(): Int {
        return descriptionList.size
    }
}