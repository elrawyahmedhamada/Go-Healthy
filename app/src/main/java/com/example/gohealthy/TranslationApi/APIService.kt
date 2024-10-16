package com.example.gohealthy.TranslationApi

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface TranslationApiService {

    @Headers("Content-Type: application/json")
    @POST("/translate")
    fun translate(@Body request: TranslationRequest): Call<TranslationResponse>
}
