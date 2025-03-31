package ru.vazzab.exp4

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ScrollActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scroll)

        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            finish() // Закрывает текущую Activity и возвращает в MainActivity
        }

        val container = findViewById<LinearLayout>(R.id.content)
        val inflater = LayoutInflater.from(this)

        repeat(20) {
            val itemView = inflater.inflate(R.layout.scroll_view, container, false)
            container.addView(itemView)
        }
    }
}
