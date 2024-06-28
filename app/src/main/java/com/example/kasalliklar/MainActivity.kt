package com.example.kasalliklar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<FrameLayout>(R.id.spid).setOnClickListener{
            intent = Intent(this,Spid::class.java)

            startActivity(intent)
        }
        findViewById<FrameLayout>(R.id.saraton).setOnClickListener{
            intent = Intent(this,Saraton::class.java)

            startActivity(intent)
        }
        findViewById<FrameLayout>(R.id.Sil).setOnClickListener{
            intent = Intent(this,Sil::class.java)

            startActivity(intent)
        }
        findViewById<FrameLayout>(R.id.insult).setOnClickListener{
            intent = Intent(this,Insult::class.java)

            startActivity(intent)
        }

    }
}