    package com.example.anime

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.each.view.*

class eachClass(val context: Context,val list:List<anime_model>):RecyclerView.Adapter<eachClass.itemview>() {
    inner class itemview(view: View): RecyclerView.ViewHolder(view){
        fun setData(anime:anime_model){
            itemView.img.setImageResource(anime.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemview {
        val view= LayoutInflater.from(context).inflate(R.layout.each,parent,false)

        return itemview(view)
    }

    override fun onBindViewHolder(holder: itemview, position: Int) {
        val img=list[position]
        holder.setData(img)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}