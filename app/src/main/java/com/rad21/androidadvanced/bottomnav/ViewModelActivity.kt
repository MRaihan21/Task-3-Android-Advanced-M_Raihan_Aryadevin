package com.rad21.androidadvanced.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.rad21.androidadvanced.databinding.ActivityViewModelBinding

class ViewModelActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewModelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.tvNo.text = viewModel.angka.toString()

        binding.btnAdd.setOnClickListener {
           viewModel.tambahAngka()
            binding.tvNo.text = viewModel.angka.toString()
        }
    }
}