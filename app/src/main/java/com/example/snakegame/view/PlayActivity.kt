package com.example.snakegame.view

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.snakegame.MainActivity
import com.example.snakegame.R

class PlayActivity : AppCompatActivity() {
    private lateinit var playBtn : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_play)

        val action = supportActionBar
        action?.hide()

        playBtn = findViewById(R.id.PlayBtn)
        playBtn.setOnClickListener {
            startActivity(Intent(this@PlayActivity, MainActivity::class.java))
        }

    }
}