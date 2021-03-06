package com.egco.lab07_json.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.egco.lab07_json.Model.Movies
import com.egco.lab07_json.Model.RSSObject
import com.egco.lab07_json.R
import kotlinx.android.synthetic.main.row.view.*

class FeedViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
    var txtTitle:TextView
    var txtPubDate:TextView
    var txtContent:TextView

    init {
        txtTitle = itemView.findViewById(R.id.txtTitle)
        txtPubDate = itemView.findViewById(R.id.txtPubdate)
        txtContent = itemView.findViewById(R.id.txtContent)
    }
}

class FeedAdapter (private val rssObject:ArrayList<Movies>, private val mContext:Context):RecyclerView.Adapter<FeedViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedViewHolder {
        val itemView = inflater.inflate(R.layout.row, parent, false)
        return FeedViewHolder(itemView)
    }

    private val inflater:LayoutInflater = LayoutInflater.from(mContext)

    override fun onBindViewHolder(holder: FeedViewHolder, position: Int) {
        holder.txtTitle.text = rssObject[position].name
        holder.txtPubDate.text = rssObject[position].Year
        holder.txtContent.text = rssObject[position].Star
    }

    override fun getItemCount(): Int {
       return rssObject.size
    }

}