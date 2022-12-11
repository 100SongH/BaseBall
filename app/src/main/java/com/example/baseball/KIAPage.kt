package com.example.baseball

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TabHost
import androidx.appcompat.app.AppCompatActivity
import com.example.baseball.databinding.ActivityKiapageBinding
import com.example.baseball.databinding.ActivityMainBinding


class KIAPage : AppCompatActivity() {
    private lateinit var binding: ActivityKiapageBinding
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kiapage)

        binding = ActivityKiapageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        makeTabHost()
        clickListner()

    }

    fun makeTabHost() {
        val tabHost: TabHost = findViewById<TabHost>(R.id.tabHost1)
        tabHost.setup()
        val tab1 = tabHost.newTabSpec("person")
        tab1.setIndicator("개인 선수")
        tab1.setContent(R.id.tab1)
        tabHost.addTab(tab1)

        val tab2 = tabHost.newTabSpec("present")
        tab2.setIndicator("구단 소개")
        tab2.setContent(R.id.tab2)
        tabHost.addTab(tab2)


        tabHost.currentTab = 0
    }

    fun clickListner() {
        binding.Rank51.setOnClickListener {
            val intent = Intent(this, Rank51::class.java)
            startActivity(intent)
        }

        binding.Rank52.setOnClickListener {
            val intent = Intent(this, Rank52::class.java)
            startActivity(intent)
        }

        binding.Rank53.setOnClickListener {
            val intent = Intent(this, Rank53::class.java)
            startActivity(intent)
        }

        binding.Rank54.setOnClickListener {
            val intent = Intent(this, Rank54::class.java)
            startActivity(intent)
        }

        binding.Rank55.setOnClickListener {
            val intent = Intent(this, Rank55::class.java)
            startActivity(intent)
        }

        binding.Rank56.setOnClickListener {
            val intent = Intent(this, Rank56::class.java)
            startActivity(intent)
        }

        binding.Rank57.setOnClickListener {
            val intent = Intent(this, Rank57::class.java)
            startActivity(intent)
        }

        binding.Rank58.setOnClickListener {
            val intent = Intent(this, Rank58::class.java)
            startActivity(intent)
        }

        binding.Rank59.setOnClickListener {
            val intent = Intent(this, Rank59::class.java)
            startActivity(intent)
        }

        binding.Rank510.setOnClickListener {
            val intent = Intent(this, Rank510::class.java)
            startActivity(intent)
        }
    }
}