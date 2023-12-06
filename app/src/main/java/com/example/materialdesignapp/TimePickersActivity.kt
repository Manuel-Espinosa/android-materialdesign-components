package com.example.materialdesignapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import android.widget.Toast
import com.example.materialdesignapp.databinding.ActivityTimePickersBinding

class TimePickersActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTimePickersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimePickersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.timepickerStandard.setOnTimeChangedListener { _, hourOfDay, minute ->
            showToast("Selected Time: ${formatTime(hourOfDay, minute)}")
        }
    }

    private fun formatTime(hour: Int, minute: Int): String {
        return String.format("%02d:%02d", hour, minute)
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
