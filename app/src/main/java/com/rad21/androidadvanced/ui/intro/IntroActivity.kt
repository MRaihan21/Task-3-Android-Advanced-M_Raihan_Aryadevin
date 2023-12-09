package com.rad21.androidadvanced.ui.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rad21.androidadvanced.bottomnav.MainActivity
import com.rad21.androidadvanced.MainActivity2
import com.rad21.androidadvanced.SharePreferenceActivity
import com.rad21.androidadvanced.bottomnav.ViewModelActivity
import com.rad21.androidadvanced.databinding.ActivityIntroBinding
import com.rad21.androidadvanced.tab.TabActivity

class IntroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMove.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnSharepreference.setOnClickListener {
            val intent = Intent(this, SharePreferenceActivity::class.java)
            startActivity(intent)
        }

        binding.btnViewmodel.setOnClickListener {
            val intent = Intent(this, ViewModelActivity::class.java)
            startActivity(intent)
        }

        binding.btnDrawer.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        binding.btnTab.setOnClickListener {
            val intent = Intent(this, TabActivity::class.java)
            startActivity(intent)
        }

    }
}