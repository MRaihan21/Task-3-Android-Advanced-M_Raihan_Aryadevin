package com.rad21.androidadvanced.bottomnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.rad21.androidadvanced.R
import com.rad21.androidadvanced.databinding.ActivityDetailBinding
import com.rad21.androidadvanced.data.Berita


class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)


        val image = intent.getParcelableExtra<Berita>(MainActivity.INTENT_PARCELABLE)

        val title = findViewById<TextView>(R.id.tv_title_detail)
        val desc = findViewById<TextView>(R.id.tv_desc_detail)
        val img = findViewById<ImageView>(R.id.iv_image_detail)

        if (image != null) {
            title.text = image.title
            desc.text = image.detail
            img.setImageResource(image.image)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}