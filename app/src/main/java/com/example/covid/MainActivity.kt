package com.example.covid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ConfigNetwork().getCovid().getDataCovid().enqueue(object : Callback<Covid>{
            override fun onResponse(call: Call<Covid>, response: Response<Covid>) {
                if (response.isSuccessful){
                    val positif = response.body()?.positif
                    val sembuh = response.body()?.sembuh
                    val meninggal = response.body()?.meninggal

                    btn_start.setOnClickListener {
                        val intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("positif", positif)
                        intent.putExtra("sembuh", sembuh)
                        intent.putExtra("meninggal", meninggal)
                        startActivity(intent)
                    }

                }
            }

            override fun onFailure(call: Call<Covid>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Tidak Bisa Connect", Toast.LENGTH_LONG).show()
            }
        })

    }
}