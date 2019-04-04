package fms.android.icbh.adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import fms.android.icbh.models.Video

class VideoListAdapter(private val itemArray: ArrayList<Video>): RecyclerView.Adapter<VideoListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return itemArray.count()
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindItem(){

        }
    }
}