package com.rad21.androidadvanced.bottomnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rad21.androidadvanced.databinding.ActivityDetailNewsBinding

class DetailNewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setContentView(R.layout.activity_detail_news)


        binding.ivArrowBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}