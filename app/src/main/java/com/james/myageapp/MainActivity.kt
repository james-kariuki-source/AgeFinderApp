package com.james.myageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.james.myageapp.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAge.setOnClickListener {
            val userYear = binding.txtYear.text.toString().toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val result = currentYear - userYear

            binding.txtAge.text = "Your age is $result"
        }
    }
}