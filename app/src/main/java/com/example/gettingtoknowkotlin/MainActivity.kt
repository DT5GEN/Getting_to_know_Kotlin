package com.example.gettingtoknowkotlin

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.gb.kotlin_lesson1.Note

class MainActivity : AppCompatActivity() {

    private var counter: Int = 0
    private var counterCats: Int = 0

//    var cats = Note()
//    val newCat = cats.copy(title = "New Title")



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.activity_main__text_view)
        val textViewCats: TextView = findViewById(R.id.activity_main__text_view_cats)
        val textViewRavens: TextView = findViewById(R.id.activity_main__text_view_ravens)

        val button: Button = findViewById(R.id.activity_main__button)

        val buttonCounter: Button = findViewById(R.id.activity_main__button_count)
        val buttonCounterCats: Button = findViewById(R.id.activity_main__button_cat)
        val buttonObjectExtractor: Button = findViewById(R.id.activity_main__object_text)


        button.setOnClickListener { textView.text = cat1.age.toString() + " and " + cat2.age.toString()
            it.setBackgroundColor(Color.RED)
            counter = 0
            counterCats = 0

        }
        buttonObjectExtractor.setOnClickListener { textView.text = cat2.age.toString()

        }

        buttonCounter.setOnClickListener {
            textViewRavens.text = """Я насчитал ${++counter} ворон"""
        }

        buttonCounterCats.setOnClickListener {
            textViewCats.text = """Я увидел ${++counterCats} кошек"""
        }



    }



}


//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}