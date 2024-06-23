package com.axdev.gamma26pokedex2.recyclerview4

/**
 * Created by HachaDev 23/06/24
 */

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.axdev.gamma26pokedex2.databinding.ItemRecyclerview4Binding

class ViewHolder4(view: View) : RecyclerView.ViewHolder(view)  {
    private val binding2 = ItemRecyclerview4Binding.bind(view)

    fun render(itemModel: String, onclickListener: (String) -> Unit) {
        binding2.textview1recycler4.text = itemModel
        itemView.setOnClickListener { onclickListener(itemModel) }}
}
