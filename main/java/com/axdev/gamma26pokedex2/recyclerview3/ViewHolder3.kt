package com.axdev.gamma26pokedex2.recyclerview3

/**
 * Created by HachaDev 23/06/24
 */

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.axdev.gamma26pokedex2.apiobjects.Abilities
import com.axdev.gamma26pokedex2.apiqueryabilities.ResponseAbilities
import com.axdev.gamma26pokedex2.databinding.ItemRecyclerview3Binding

class ViewHolder3(view: View) : RecyclerView.ViewHolder(view)  {
    private val binding2 = ItemRecyclerview3Binding.bind(view)

    fun render(itemModel: AdapterForListRecycler3, onclickListener: (AdapterForListRecycler3) -> Unit) {
        binding2.textview1recycler3.text = itemModel.name
        binding2.textview2recycler3.text = itemModel.effect
        itemView.setOnClickListener { onclickListener(itemModel) }
        }
}
