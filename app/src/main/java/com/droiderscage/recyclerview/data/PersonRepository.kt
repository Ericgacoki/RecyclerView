package com.droiderscage.recyclerview.data

import com.droiderscage.recyclerview.data.Person

class PersonRepository {
    // This should contain ROOM methods or remote API fun that deals with saving and retrieving data
    // break the above strategy and ignore the image param below for a while...
    fun getPersonData(): ArrayList<Person> = arrayListOf(
        Person("Eric", "gacoki@gmail.com", 0),
        Person("Paul", "pauldroider@gmail.com",0),
        Person("John Doe", "doejohn@gmail.com", 0),
        Person("Sudo", "sudos@gmail.com", 0),
    )
}