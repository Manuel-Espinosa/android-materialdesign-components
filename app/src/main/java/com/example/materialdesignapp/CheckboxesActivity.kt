package com.example.materialdesignapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialdesignapp.databinding.ActivityCheckboxesBinding

class CheckboxesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCheckboxesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckboxesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Standard Checkbox
        binding.checkboxStandard.setOnCheckedChangeListener { _, isChecked ->
            showToast("Standard Checkbox: ${if (isChecked) "Checked" else "Unchecked"}")
        }

        // Custom Checkbox
        binding.checkboxCustom.setOnCheckedChangeListener { _, isChecked ->
            showToast("Custom Checkbox: ${if (isChecked) "Checked" else "Unchecked"}")
        }

    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
