package com.example.materialdesignapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialdesignapp.databinding.ActivityDatePickersBinding
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class DatePickersActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDatePickersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDatePickersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.datepickerStandard.setOnDateChangedListener { _, year, month, dayOfMonth ->
            val calendar = Calendar.getInstance().apply {
                set(year, month, dayOfMonth)
            }
            val formattedDate = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(calendar.time)
            showToast("Selected Date: $formattedDate")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
