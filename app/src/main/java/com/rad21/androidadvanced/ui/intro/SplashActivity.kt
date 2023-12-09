package com.rad21.androidadvanced.ui.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.rad21.androidadvanced.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val image : ImageView = findViewById(R.id.iv_logo)
        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.slide)
        image.startAnimation(slideAnimation)

        Handler().postDelayed({
            startActivity(Intent(this, IntroActivity::class.java))
            finish()
        }, 3000)

    }
}