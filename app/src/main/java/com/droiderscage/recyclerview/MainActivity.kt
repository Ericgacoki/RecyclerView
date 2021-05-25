package com.droiderscage.recyclerview

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.droiderscage.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private val recyclerviewAdapter: Adapter = Adapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        initiateRecyclerView()
    }

    private fun initiateRecyclerView() {
        binding.recyclerView.apply {
            adapter = recyclerviewAdapter
        }
    }
}