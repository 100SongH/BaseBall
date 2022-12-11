package com.example.baseball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.baseball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.all.setOnClickListener {
            val intent = Intent(this, AllPage::class.java)
            startActivity(intent)
        }



        binding.KIA.setOnClickListener {
            val intent = Intent(this, KIAPage::class.java)
            startActivity(intent)
        }

    }
}