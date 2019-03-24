package fms.android.icbh.Services

import fms.android.icbh.Model.News
import retrofit2.Call
import retrofit2.http.GET

interface NewsService {

    @GET("news")
    fun index() : Call<ArrayList<News>>
}