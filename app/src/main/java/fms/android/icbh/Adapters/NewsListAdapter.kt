package fms.android.icbh.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import fms.android.icbh.Model.News
import fms.android.icbh.R

class NewsListAdapter(val context: Context, val newsArray: ArrayList<News>): RecyclerView.Adapter<NewsListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_view_news, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindNews(context, newsArray[position])
    }

    override fun getItemCount(): Int {
        return newsArray.count()
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
//        val newsImage = itemView.findViewById<ImageView>(R.id.newsImage)
        val newsTitleText = itemView.findViewById<TextView>(R.id.text_news_title)
        val newsBodyText = itemView.findViewById<TextView>(R.id.text_news_body)

        fun bindNews(context: Context, newsItem: News) {
            newsTitleText.text = newsItem.title
            newsBodyText.text = newsItem.body
            Log.d("LIST ADAPTER", newsItem.title_image)
        }
    }
}