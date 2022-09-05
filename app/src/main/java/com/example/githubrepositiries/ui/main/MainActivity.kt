package com.example.githubrepositiries.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.githubrepositiries.databinding.ActivityMainBinding
import com.example.githubrepositiries.ui.repo.ReposActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signBtn.setOnClickListener {val intent = Intent(this@MainActivity, ReposActivity::class.java)
            startActivity(intent)}
    }
}
