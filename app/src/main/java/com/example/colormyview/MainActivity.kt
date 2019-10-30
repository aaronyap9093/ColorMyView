package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.ic_check_black_24dp)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.ic_android_black_24dp)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.ic_check_black_24dp)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.ic_check_black_24dp)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.ic_check_black_24dp)
            R.id.random_box_1 -> view.setBackgroundResource(R.drawable.ic_insert_emoticon_black_24dp)
            R.id.random_box_2 -> view.setBackgroundResource(R.drawable.ic_insert_emoticon_black_24dp)
            R.id.random_box_3 -> view.setBackgroundResource(R.drawable.ic_insert_emoticon_black_24dp)
            R.id.random_box_4 -> view.setBackgroundResource(R.drawable.ic_insert_emoticon_black_24dp)
            else -> view.setBackgroundResource(R.drawable.ic_highlight_off_black_24dp)
        }
    }
    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxRandomOne = findViewById<TextView>(R.id.random_box_1)
        val boxRandomTwo = findViewById<TextView>(R.id.random_box_2)
        val boxRandomThree = findViewById<TextView>(R.id.random_box_3)
        val boxRandomFour = findViewById<TextView>(R.id.random_box_4)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, boxRandomOne, boxRandomTwo, boxRandomThree, boxRandomFour,
                rootConstraintLayout)
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}
