package com.axdev.gamma26pokedex2.recyclerview2

/**
 * Created by HachaDev 23/06/24
 */

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.axdev.gamma26pokedex2.apiobjects.Sprites
import com.axdev.gamma26pokedex2.databinding.ItemRecyclerview2Binding
import com.bumptech.glide.Glide

class ViewHolder2 (view: View) : RecyclerView.ViewHolder(view)  {
    private val binding2 = ItemRecyclerview2Binding.bind(view)

    fun render(itemModel: String, onclickListener: (String) -> Unit) {
        binding2.iv1.setOnClickListener { onclickListener(itemModel) }
        Glide.with(binding2.iv1.context).load(itemModel).into(binding2.iv1)
       }
}
