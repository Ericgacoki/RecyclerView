package com.droiderscage.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.droiderscage.recyclerview.data.Person
import com.droiderscage.recyclerview.databinding.PersonItemBinding

class Adapter(
   var personData: ArrayList<Person>
): RecyclerView.Adapter<Adapter.PersonViewHolder>() {

    inner class PersonViewHolder(private val person: PersonItemBinding): RecyclerView.ViewHolder(person.root){
        fun bind(currentPersonItem: Person){
            person.name.text = currentPersonItem.name
            person.email.text = currentPersonItem.email
          //  person.image.setImageDrawable(currentPersonItem.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        return PersonViewHolder(PersonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bind(personData[position])
    }

    override fun getItemCount(): Int = personData.size
}