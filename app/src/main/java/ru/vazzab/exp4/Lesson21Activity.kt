package ru.vazzab.exp4

import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView

class Lesson21Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lesson21_material)

        val topAppBar = findViewById<MaterialToolbar>(R.id.topAppBar)
        topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.fav -> {
                    Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.search -> {
                    Toast.makeText(this, "Поиск", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.more -> {
                    Toast.makeText(this, "Еще", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> false
            }


        }

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navigationView = findViewById<NavigationView>(R.id.navigation_view)

        // Открываем боковое меню при нажатии на кнопку
        topAppBar.setNavigationOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        // Обработчик кликов по пунктам меню
        navigationView.setNavigationItemSelectedListener { menuItem: MenuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> showToast("Главная")
                R.id.nav_settings -> showToast("Настройки")
                R.id.nav_about -> showToast("О программе")
            }
            drawerLayout.closeDrawer(GravityCompat.START) // Закрываем меню
            true
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


}