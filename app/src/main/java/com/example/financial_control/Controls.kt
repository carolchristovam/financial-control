package com.example.financial_control

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.financial_control.databinding.ActivityControlsBinding

class Controls : AppCompatActivity() {

    private lateinit var binding: ActivityControlsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityControlsBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}