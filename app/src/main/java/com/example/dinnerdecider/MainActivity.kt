package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    var foodList = ArrayList<String>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foodList.add("Hamburger")
        foodList.add("Pizza")
        foodList.add("Mexican")
        foodList.add("American")
        foodList.add("Chinese")
    }

    fun decide(view: View) {
        val decideFood = findViewById<TextView>(R.id.decidedFood)
        val selection = Random().nextInt(foodList.size)

        decideFood.text = foodList[selection]
    }

    fun add(view: View) {
        val newFood = findViewById<EditText>(R.id.addNewFood)
        val decidedFood = findViewById<TextView>(R.id.decidedFood)

        foodList.add(newFood.text.toString())
        decidedFood.text = newFood.text
        newFood.text.clear()
    }
}