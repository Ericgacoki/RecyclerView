package com.droiderscage.recyclerview.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.droiderscage.recyclerview.adapter.Adapter
import com.droiderscage.recyclerview.data.Person
import com.droiderscage.recyclerview.databinding.ActivityMainBinding
import com.droiderscage.recyclerview.viewmodel.PersonViewModel

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var personAdapter: Adapter
    private var personData = arrayListOf<Person>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val personViewModel: PersonViewModel = ViewModelProvider(this).get(PersonViewModel::class.java)
        personData = personViewModel.personData

        initRecyclerView()
    }

    private fun initRecyclerView() {
        personAdapter = Adapter(personData)
        binding.recyclerView.apply {
            adapter = personAdapter
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}