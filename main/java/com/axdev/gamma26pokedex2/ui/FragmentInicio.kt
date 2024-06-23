package com.axdev.gamma26pokedex2.ui

/**
 * Created by HachaDev 23/06/24
 */

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.axdev.gamma26pokedex2.R
import androidx.navigation.fragment.findNavController

class FragmentInicio : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_inicio, container, false)
        val button1 = root.findViewById<Button>(R.id.button1)
        button1.setOnClickListener {

            findNavController().navigate(
                FragmentInicioDirections.actionFragmentInicioToMainActivity2())
        }
        return root
    }


}