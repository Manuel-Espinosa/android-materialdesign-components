
package com.example.materialdesignapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.materialdesignapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up the button listeners
        binding.btnButtons.setOnClickListener {
            startActivity(Intent(this, ButtonsActivity::class.java))
        }

        binding.btnTextFields.setOnClickListener {
            startActivity(Intent(this, TextFieldsActivity::class.java))
        }

        binding.btnDatePickers.setOnClickListener {
            startActivity(Intent(this, DatePickersActivity::class.java))
        }

        binding.btnTimePickers.setOnClickListener {
            startActivity(Intent(this, TimePickersActivity::class.java))
        }

        binding.btnSliders.setOnClickListener {
            startActivity(Intent(this, SlidersActivity::class.java))
        }

        binding.btnCheckboxes.setOnClickListener {
            startActivity(Intent(this, CheckboxesActivity::class.java))
        }
    }
}