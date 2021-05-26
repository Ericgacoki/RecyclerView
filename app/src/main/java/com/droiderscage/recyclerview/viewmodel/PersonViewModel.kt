package com.droiderscage.recyclerview.viewmodel

import androidx.lifecycle.ViewModel
import com.droiderscage.recyclerview.data.PersonRepository

class PersonViewModel: ViewModel() {
    val personData = PersonRepository().getPersonData()
}