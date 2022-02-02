package com.example.gettingtoknowkotlin

import ru.gb.kotlin_lesson1.Note

data class Cats(var name: String, var age: Int)
val cat1 = Cats("Barsik", 4)
val cat2 = cat1.copy(age = 7) // у копии объекта меняем только возраст

fun main() {
    println(cat1)
    println(cat2)


//    var cats = Note()
//    val newCat = cats.copy(title = "New Title")

}

