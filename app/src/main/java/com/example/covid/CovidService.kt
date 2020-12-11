package com.example.covid

import retrofit2.Call
import retrofit2.http.GET

interface CovidService {

    @GET("api/indonesia")
    fun getDataCovid() : Call<Covid>

}