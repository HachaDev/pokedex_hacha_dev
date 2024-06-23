package com.axdev.gamma26pokedex2.recyclerview6

/**
 * Created by HachaDev 23/06/24
 */

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.axdev.gamma26pokedex2.apiqueryhelditems.ResponseHeldItems
import com.axdev.gamma26pokedex2.databinding.ItemRecyclerview6Binding

class ViewHolder6(view: View) : RecyclerView.ViewHolder(view)  {
    private val binding2 = ItemRecyclerview6Binding.bind(view)
    fun render(itemModel: ResponseHeldItems, onclickListener: (ResponseHeldItems) -> Unit) {
        binding2.textview1recycler6.text = itemModel.name
        binding2.textview2recycler6.text = itemModel.effect_entries[0].short_effect
        itemView.setOnClickListener { onclickListener(itemModel) }
        }
}
