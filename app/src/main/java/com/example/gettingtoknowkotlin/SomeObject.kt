package com.example.gettingtoknowkotlin

import ru.gb.kotlin_lesson1.Note


object SomeObject {

    var cats = Note()
   val newCat = cats.copy(title = "New Title")
}