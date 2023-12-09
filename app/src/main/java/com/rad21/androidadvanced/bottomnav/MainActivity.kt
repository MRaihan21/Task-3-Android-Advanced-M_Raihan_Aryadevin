package com.rad21.androidadvanced.bottomnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rad21.androidadvanced.R
import com.rad21.androidadvanced.databinding.ActivityMainBinding
import com.rad21.androidadvanced.data.Berita
import com.rad21.androidadvanced.adapter.BeritaAdapter

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val beritaList =  listOf<Berita>(
            Berita(
                "Man United",
                "Marcus Rashford dan Mason Mount kesulitan dalam Manchester United musim ini. Ada kekhawatiran mereka akan senasib dengan Paul Pogba dan Angel Di Maria. Rashford meredup musim ini di MU dan baru mencetak dua gol dari 19 penampilan di seluruh ajang. Padahal musim lalu ia bersinar dengan mencetak 30 gol dan jadi top skor tim, lebih dari dua kali lipat torehan Bruno Fernandes (14 gol).\n" +
                        "\n" +
                        "Senada dengan Rashford, Mason Mount juga belum mampu bersinar. Didatangkan dari Chelsea pada bursa transfer musim panas kemarin senilai total 60 juta paun, gelandang 24 tahun itu belum berkontribusi gol dan baru bikin satu assist dari 12 laga.",
                R.drawable.image2
            ),
            Berita(
                "Chelsea",
                "Chelsea terhambat seretnya gol dari penyerangnya. Tapi merekrut penyerang baru lagi dinilai bukan langkah yang bijak.\n" +
                        "Chelsea mengandalkan Nicolas Jackson di posisi penyerang tengah musim ini, menyusul cederanya Christopher Nkunku. Jackson yang baru didatangkan dari Villarreal musim panas kemarin belum cukup mampu membayar kepercayaan besar itu.\n" +
                        "\n" +
                        "Ia memang sudah bikin enam gol dari 14 penampilan di Premier League, akan tetapi tiga di antaranya dicetak di satu laga. Secara keseluruhan ia baru membuat gol di empat pertandingan sementara puasa di 10 lainnya",
                R.drawable.image1
            ),
            Berita(
                "Liverpool",
                "Juergen Klopp begitu puas dengan kemenangan 2-0 Liverpool atas Sheffield United. Hal ini menunjukkan kematangan permainan Si Merah. Liverpool meraih kemenangan 2-0 atas Sheffield United di Bramall Lane pada laga pekan ke-15 Premier League, Dua gol Si Merah dibuat oleh Virgil van Dijk dan Dominik Szoboszlai.\n" +
                        "\n" +
                        "Kemenangan ini tak sepenuhnya mudah untuk Liverpool. Meski, mereka menguasai laga.",
                R.drawable.image3
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_daftarBerita)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BeritaAdapter(this, beritaList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

        binding.ivImageHeadline.setOnClickListener {
            val intent = Intent(this, DetailNewsActivity::class.java)
            startActivity(intent)
        }

    }
}