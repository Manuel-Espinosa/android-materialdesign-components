package com.example.materialdesignapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialdesignapp.databinding.ActivitySlidersBinding

class SlidersActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySlidersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySlidersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Standard Slider
        binding.sliderStandard.addOnChangeListener { _, value, _ ->
            showToast("Standard Slider Value: $value")
        }

        // Continuous Slider
        binding.sliderContinuous.addOnChangeListener { _, value, _ ->
            showToast("Continuous Slider Value: $value")
        }

    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}