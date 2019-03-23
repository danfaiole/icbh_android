package fms.android.icbh.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import fms.android.icbh.Model.News
import fms.android.icbh.R

class NewsListAdapter(val context: Context, val newsArray: ArrayList<News>): RecyclerView.Adapter<NewsListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.news_list_view, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return newsArray.count()
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val newsImage = itemView.findViewById<ImageView>(R.id.newsImage)
        val newsTitleText = itemView.findViewById<TextView>(R.id.newsTitleText)
        val newsBodyText = itemView.findViewById<TextView>(R.id.newsBodyText)

        fun bindNews(context: Context, newsItem: News) {
            newsTitleText.text = newsItem.title
            newsBodyText.text = newsItem.newsBody
        }
    }
}