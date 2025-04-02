package ru.vazzab.exp4


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_view)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)



        button1.setOnClickListener {
            startActivity(Intent(this, ScrollActivity::class.java))
        }

        button2.setOnClickListener {
            startActivity(Intent(this, Lesson20Activity::class.java))
        }

        button3.setOnClickListener {
            startActivity(Intent(this, CardviewActivity::class.java))

        }

        button4.setOnClickListener {
            startActivity(Intent(this, Lesson21Activity::class.java))

        }

    }
}