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

        binding.SSG.setOnClickListener {
            val intent = Intent(this, SSGPage::class.java)
            startActivity(intent)
        }

        binding.Kiwoom.setOnClickListener {
            val intent = Intent(this, KiwoomPage::class.java)
            startActivity(intent)
        }

        binding.LG.setOnClickListener {
            val intent = Intent(this, LGPage::class.java)
            startActivity(intent)
        }

        binding.KT.setOnClickListener {
            val intent = Intent(this, KTPage::class.java)
            startActivity(intent)
        }

        binding.KIA.setOnClickListener {
            val intent = Intent(this, KIAPage::class.java)
            startActivity(intent)
        }

        binding.NC.setOnClickListener {
            val intent = Intent(this, NCPage::class.java)
            startActivity(intent)
        }

        binding.Samsung.setOnClickListener {
            val intent = Intent(this, SamsungPage::class.java)
            startActivity(intent)
        }

        binding.Lotte.setOnClickListener {
            val intent = Intent(this, LottePage::class.java)
            startActivity(intent)
        }

        binding.Doosan.setOnClickListener {
            val intent = Intent(this, DoosanPage::class.java)
            startActivity(intent)
        }

        binding.Hanwha.setOnClickListener {
            val intent = Intent(this, HanwhaPage::class.java)
            startActivity(intent)
        }
    }
}