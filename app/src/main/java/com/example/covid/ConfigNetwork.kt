package com.example.covid

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ConfigNetwork  {

    fun getCovid() : CovidService {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://apicovid19indonesia-v2.vercel.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(CovidService::class.java)

        return service

    }

}