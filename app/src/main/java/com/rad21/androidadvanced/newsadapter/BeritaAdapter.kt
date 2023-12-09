package com.rad21.androidadvanced.newsadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rad21.androidadvanced.R

class BeritaAdapter (
    private val context: Context,
    private val news: List<Berita>,
    val listener: (Berita) -> Unit
) : RecyclerView.Adapter<BeritaAdapter.MyViewHolder>(){

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val title = view.findViewById<TextView>(R.id.tv_title)
        val desch = view.findViewById<TextView>(R.id.tv_desc)
        val img = view.findViewById<ImageView>(R.id.iv_image)

        fun bindView(berita: Berita, listener: (Berita) -> Unit) {
            title.text = berita.title
            desch.text = berita.detail
            img.setImageResource(berita.image)
            itemView.setOnClickListener { listener(berita) }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_news, parent, false))

    override fun getItemCount(): Int = news.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindView(news[position], listener)
    }
}