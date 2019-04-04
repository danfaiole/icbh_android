package fms.android.icbh.services

import fms.android.icbh.models.News
import retrofit2.Call
import retrofit2.http.GET

interface NewsService {

    @GET("news")
    fun index() : Call<ArrayList<News>>
}