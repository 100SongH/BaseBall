package com.example.baseball


import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TabHost
import androidx.appcompat.app.AppCompatActivity
import com.example.baseball.databinding.ActivityKiapageBinding


class KIAPage : AppCompatActivity() {
    private lateinit var binding: ActivityKiapageBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kiapage)

        binding = ActivityKiapageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabHost: TabHost = findViewById(R.id.tabHost)
        tabHost.setup()

        val tab1 = tabHost.newTabSpec("present").setIndicator("구단 소개")
        tab1.setContent(R.id.tab1)
        tabHost.addTab(tab1)




        tabHost.currentTab = 0
    }
}