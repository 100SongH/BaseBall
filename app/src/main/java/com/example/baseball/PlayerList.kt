package com.example.baseball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleAdapter
import com.example.baseball.databinding.ActivityMainBinding
import com.example.baseball.databinding.ActivityPlayerListBinding

class PlayerList : AppCompatActivity() {
    private lateinit var binding: ActivityPlayerListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_list)



    }

}