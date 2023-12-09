package com.rad21.androidadvanced.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var angka = 0

    fun tambahAngka(){
        angka++
    }
}