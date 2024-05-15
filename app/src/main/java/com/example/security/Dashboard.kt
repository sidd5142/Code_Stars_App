package com.example.security

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.security.databinding.ActivityDashboardBinding

class Dashboard : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.cardView1.setOnClickListener {
            startActivity(Intent(this, account::class.java))
        }

        binding.cardView2.setOnClickListener {
            startActivity(Intent(this, account::class.java))
        }

        binding.cardView3.setOnClickListener {
            startActivity(Intent(this, account::class.java))
        }

        binding.cardView4.setOnClickListener {
            startActivity(Intent(this, account::class.java))
        }
    }
}