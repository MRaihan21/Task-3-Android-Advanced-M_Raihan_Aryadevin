package com.rad21.androidadvanced

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.rad21.androidadvanced.databinding.ActivitySharePreferenceBinding

class SharePreferenceActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySharePreferenceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySharePreferenceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()

        binding.btnSave.setOnClickListener {
            saveData()
        }

    }

    private fun saveData(){

        val insertedTExt = binding.edtText.text.toString()
        binding.tvText.text = insertedTExt

        val sharePreference = getSharedPreferences("sharePrefs", Context.MODE_PRIVATE)
        val editor = sharePreference.edit()
        editor.apply {
            putString("STRING_KEY", insertedTExt)
            putBoolean("BOOLEAN_KEY", binding.swSwitch.isChecked)
        }.apply()

        Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show()
    }

    private fun loadData(){
        val sharePreference = getSharedPreferences("sharePrefs", Context.MODE_PRIVATE)
        val saveString = sharePreference.getString("STRING_KEY", null)
        val savedBoolean = sharePreference.getBoolean("BOOLEAN_KEY", false)

        binding.tvText.text = saveString
        binding.swSwitch.isChecked = savedBoolean
    }
}