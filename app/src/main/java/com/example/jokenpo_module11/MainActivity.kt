package com.example.jokenpo_module11

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jokenpo_module11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val toolbar = binding.appBar

        setContentView(binding.root)
        setSupportActionBar(toolbar)

        supportActionBar?.title = " Outro titulo"
        supportActionBar?.setLogo(R.drawable.ic_logo)
        supportActionBar?.setDisplayUseLogoEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val activity2Intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("name", "Juliana")
        intent.putExtra("age", 23)

     val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Minha mensagem")
        sendIntent.type = "text/plain"

        binding.btnStartActivity.setOnClickListener {
            startActivity(activity2Intent)
        }
    }

  override  fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}