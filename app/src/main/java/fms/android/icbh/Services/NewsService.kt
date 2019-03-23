package fms.android.icbh.Services

import retrofit2.http.GET

interface NewsService {

    @GET("news")
    fun index()
}