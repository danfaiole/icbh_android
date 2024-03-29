package fms.android.icbh.utilities

import fms.android.icbh.services.NewsService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitConfig {

    private val retrofit : Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun newsService(): NewsService = retrofit.create(NewsService::class.java)
}