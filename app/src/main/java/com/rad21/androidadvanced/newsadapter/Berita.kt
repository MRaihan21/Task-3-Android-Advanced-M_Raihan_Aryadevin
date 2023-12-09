package com.rad21.androidadvanced.newsadapter

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Berita(
    var title: String,
    var detail: String,
    var image: Int
): Parcelable
