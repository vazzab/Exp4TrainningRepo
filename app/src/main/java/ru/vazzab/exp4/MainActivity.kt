package ru.vazzab.exp4


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item)

        // Находим кнопки в основном layout (item.xml)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        // Обработчики нажатий
        button1.setOnClickListener {
            startActivity(Intent(this, ScrollActivity::class.java))
        }

        button2.setOnClickListener {
            startActivity(Intent(this, View20Activity::class.java))
        }
    }
}