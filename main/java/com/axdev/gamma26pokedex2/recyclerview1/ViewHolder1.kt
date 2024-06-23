package com.axdev.gamma26pokedex2.recyclerview1

/**
 * Created by HachaDev 23/06/24
 */

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.axdev.gamma26pokedex2.databinding.ItemRecyclerview1Binding

class ViewHolder1(view: View) : RecyclerView.ViewHolder(view)  {
    private val binding2 = ItemRecyclerview1Binding.bind(view)

    fun render(itemModel: Recycler1Object, onclickListener: (Recycler1Object) -> Unit) {
        binding2.textview1recycler1.text = itemModel.titulo
        binding2.textview2recycler1.text = itemModel.descripcion
        itemView.setOnClickListener { onclickListener(itemModel) }
    }
}
