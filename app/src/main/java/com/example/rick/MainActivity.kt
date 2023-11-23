package com.example.rick

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RatingBar
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ")
            startActivity(intent)
        }

        val switch = findViewById<SwitchCompat>(R.id.switchdark)

        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)

            when (switch.isChecked) {
                true -> intent.data = Uri.parse("https://www.youtube.com/watch?v=1P5yyeeYF9o")
                false -> intent.data = Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ")
            }

            startActivity(intent)
        }



        class MainActivity : AppCompatActivity() {

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val ratingBar = findViewById<RatingBar>(R.id.RatingBar)

                ratingBar.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
                    override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                        println("Rating: $rating")
                    }
                })
            }
        }


    }
}