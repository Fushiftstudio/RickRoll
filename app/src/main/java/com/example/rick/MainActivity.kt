package com.example.rick

import android.content.Intent
import android.media.SoundPool
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exit = findViewById<Button>(R.id.exit)
        exit.setOnClickListener {
            // Vypnutí aplikace
            finish()
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ")
            startActivity(intent)
        }

        val switch = findViewById<SwitchCompat>(R.id.switchdark)

        switch.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)

            if (switch.isChecked)
                intent.data = Uri.parse("https://www.youtube.com/watch?v=1P5yyeeYF9o")
            else
                intent.data = Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ")


            startActivity(intent)
        }
        val ImageButton = findViewById<ImageButton>(R.id.ImageButton)
        ImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://pranx.com/winxp-update/")
            startActivity(intent)
        }
    }
}


