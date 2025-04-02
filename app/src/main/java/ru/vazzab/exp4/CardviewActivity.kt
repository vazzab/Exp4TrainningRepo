package ru.vazzab.exp4

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CardviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cardview)

        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }

        val mainButton = findViewById<Button>(R.id.cardview_main_button)
        mainButton.setOnClickListener {
            Toast.makeText(this, "Я буду android-разработчиком!", Toast.LENGTH_SHORT).show()
        }
    }
}