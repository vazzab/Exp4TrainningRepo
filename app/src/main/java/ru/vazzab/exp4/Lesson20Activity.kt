package ru.vazzab.exp4

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Lesson20Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lesson20view)

        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            finish() // Закрывает текущую Activity и возвращает в предыдущую
        }
    }
}