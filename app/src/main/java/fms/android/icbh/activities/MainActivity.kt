package fms.android.icbh.activities

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import fms.android.icbh.adapters.NewsListAdapter
import fms.android.icbh.models.News
import fms.android.icbh.R
import fms.android.icbh.utilities.RetrofitConfig
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
//                    Log.d("NOME DA CLASSE JAVA", context.javaClass.simpleName)
                val mainActivityIntent : Intent = Intent(this, MainActivity::class.java)

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_schedule -> {
                println("Menu navigation schedule clicked")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_videos -> {
//                val videosActivityIntent : Intent = Intent(this, VideosActivity::class.java)

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_downloads -> {
                println("Menu navigation videos clicked")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_more -> {
                println("Menu navigation videos clicked")
                return@OnNavigationItemSelectedListener true
            }
            else -> {
                return@OnNavigationItemSelectedListener false
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("ON CREATE", "NOVA MAIN ACTIVITY")
        menu_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val request = RetrofitConfig().newsService().index()

        request.enqueue(object : Callback<ArrayList<News>?> {
            override fun onResponse(call: Call<ArrayList<News>?>, response: Response<ArrayList<News>?>) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        val newsList : ArrayList<News> = it
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
//        val recyclerView = rv_news_list
//        recyclerView.adapter = NewsListAdapter(this, news)
//
//        val layoutManager = LinearLayoutManager(this)
//        recyclerView.layoutManager = layoutManager
    }
}
