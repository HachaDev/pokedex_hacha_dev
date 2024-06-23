package com.axdev.gamma26pokedex2.recyclerview5

/**
 * Created by HachaDev 23/06/24
 */

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.axdev.gamma26pokedex2.apiobjects.Stats
import com.axdev.gamma26pokedex2.databinding.ItemRecyclerview5Binding

class ViewHolder5(view: View) : RecyclerView.ViewHolder(view)  {
    private val binding2 = ItemRecyclerview5Binding.bind(view)
    //Variable para el viewBinding

    fun render(itemModel: Stats, onclickListener: (Stats) -> Unit) {
        binding2.textview1recycler5.text = itemModel.stat.name
        val stringTextView = " = "+ itemModel.base_stat.toString()
        binding2.textview2recycler5.text = stringTextView

        itemView.setOnClickListener { onclickListener(itemModel) }
        }
}
