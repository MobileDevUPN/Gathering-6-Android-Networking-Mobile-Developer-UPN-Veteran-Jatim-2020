package com.example.covid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val positif = intent.getIntExtra("positif", 0)
        val sembuh = intent.getIntExtra("sembuh", 0)
        val meninggal = intent.getIntExtra("meninggal", 0)

        txt_positif.text = positif.toString()
        txt_sembuh.text = sembuh.toString()
        txt_meninggal.text = meninggal.toString()

    }
}