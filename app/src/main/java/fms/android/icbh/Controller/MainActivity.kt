package fms.android.icbh.Controller

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import fms.android.icbh.Adapters.NewsListAdapter
import fms.android.icbh.Model.News
import fms.android.icbh.R
import fms.android.icbh.Utilities.MenuNavigation
import fms.android.icbh.Utilities.RetrofitConfig
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(MenuNavigation.loadMenu())

        val request = RetrofitConfig().newsService().index()
        request.enqueue(object : Callback<ArrayList<News>?> {
            override fun onResponse(call: Call<ArrayList<News>?>, response: Response<ArrayList<News>?>) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        val newsList:ArrayList<News> = it
                        loadRecyclerNewsList(newsList)
                    }
                } else {
                    Log.e("REQUEST SUCCESS", response.code().toString())
                }

            }

            override fun onFailure(call: Call<ArrayList<News>?>, t: Throwable) {
                Log.e("REQUEST FAIL", t.localizedMessage)
            }
        })


    }

    private fun loadRecyclerNewsList(news: ArrayList<News>){
        val recyclerView = newsRecyclerView
        recyclerView.adapter = NewsListAdapter(this, news)

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
    }
}
