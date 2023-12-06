package com.example.materialdesignapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialdesignapp.databinding.ActivityButtonsBinding

class ButtonsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityButtonsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButtonsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Filled Button Click Listener
        binding.filledButton.setOnClickListener {
            showToast("Filled Button Clicked")
        }

        // Elevated Button Click Listener
        binding.elevatedButton.setOnClickListener {
            showToast("Elevated Button Clicked")
        }

        // Tonal Button Click Listener
        binding.tonalButton.setOnClickListener {
            showToast("Tonal Button Clicked")
        }

        // Outlined Button Click Listener
        binding.outlinedButton.setOnClickListener {
            showToast("Outlined Button Clicked")
        }

        // Text Button Click Listener
        binding.textButton.setOnClickListener {
            showToast("Text Button Clicked")
        }

    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
