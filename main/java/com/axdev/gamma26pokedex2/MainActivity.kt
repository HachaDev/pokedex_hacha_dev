package com.axdev.gamma26pokedex2

/**
 * Created by HachaDev 23/06/24
 */

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.axdev.gamma26pokedex2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}