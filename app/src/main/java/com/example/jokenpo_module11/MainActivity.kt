package com.example.jokenpo_module11

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import com.example.jokenpo_module11.databinding.ActivityMain2Binding
import com.example.jokenpo_module11.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val activity2Intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("name", "Juliana")
        intent.putExtra("age", 23)

        val activityResult = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                val intent = result.data

                if (intent?.hasExtra("result") == true) {
                    Snackbar.make(
                        binding.root,
                        intent.getStringExtra("result") ?: "",
                        Snackbar.LENGTH_SHORT
                    ).show()
                }
            }
        }




        binding.btnStartActivity.setOnClickListener {
            activityResult.launch(activity2Intent)
        }
    }
}