package com.example.jokenpo_module11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.jokenpo_module11.databinding.ActivityMain2Binding
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {

    lateinit var root: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.appBar2)

        root = binding.root
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_close)


        if (intent.extras?.isEmpty == false) {
            val name = intent.getStringExtra("name")
            val age = intent.getIntExtra("age", 0)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.second_screen_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_save -> {
                Snackbar.make(
                    this,
                    root,
                    getString(R.string.menu_save_title),
                    Snackbar.LENGTH_SHORT
                ).show()
                true
            }

            R.id.menu_settings -> {
                Snackbar.make(
                    this,
                    root,
                    getString(R.string.menu_settings_title),
                    Snackbar.LENGTH_SHORT
                ).show()
                true
            }

            else -> false
        }
    }
}