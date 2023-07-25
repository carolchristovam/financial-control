package com.example.financial_control

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.financial_control.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEnter.setOnClickListener() {
            val name = binding.textName.text.toString().trim()
            val lastName = binding.textLastName.text.toString().trim()

            if (name.isEmpty() || lastName.isEmpty()) {
                binding.textMessage.text = "Enter your name and last name to login"
                Toast.makeText(
                    applicationContext,
                    "Name and last name can not be empty",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(applicationContext, "Hello, $name $lastName", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}