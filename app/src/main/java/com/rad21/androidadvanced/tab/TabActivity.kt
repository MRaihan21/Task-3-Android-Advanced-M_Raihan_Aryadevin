package com.rad21.androidadvanced.tab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.rad21.androidadvanced.databinding.ActivityTabBinding

class TabActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTabBinding
    private lateinit var adapterVIewPage: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTabBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapterVIewPage = ViewPagerAdapter(supportFragmentManager, lifecycle)

        with(binding){
            viewPager.adapter = adapterVIewPage

            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                when(position){
                    0 -> tab.text = "Mudryk"
                    1 -> tab.text = "Nunez"
                }
            }.attach()
        }

    }
}