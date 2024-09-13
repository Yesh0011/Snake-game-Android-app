package com.example.snakegame.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.snakegame.MainActivity
import com.example.snakegame.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        val action = supportActionBar
        action?.hide()
        try{
            Handler().postDelayed({
                startActivity(Intent(this@WelcomeActivity,PlayActivity::class.java))
            },3000)
        }
        catch (e:Exception){
            e.printStackTrace()
        }

    }
}