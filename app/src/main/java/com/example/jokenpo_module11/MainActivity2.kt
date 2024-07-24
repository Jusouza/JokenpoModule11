package com.example.jokenpo_module11

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jokenpo_module11.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

       if(intent.extras?.isEmpty == false){
           val name = intent.getStringExtra("name")
           val age = intent.getIntExtra("age", 0)
       }

        val result = Intent()

        result.putExtra("result", "Navegaçao com intents")
        setResult(Activity.RESULT_OK, result)
        finish()
    }
}