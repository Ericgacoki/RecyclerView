package com.droiderscage.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droiderscage.recyclerview.databinding.PersonItemBinding

class Adapter : RecyclerView.Adapter<Adapter.PersonViewHolder>() {

    override fun getItemCount(): Int {
        return 24
    }

    inner class PersonViewHolder(person: PersonItemBinding) :
        RecyclerView.ViewHolder(person.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        return PersonViewHolder(
            PersonItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {

    }

}