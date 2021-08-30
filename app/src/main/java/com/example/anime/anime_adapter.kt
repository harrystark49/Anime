package com.example.anime

import android.content.Context
import android.content.Intent
import android.view.ActionMode
import android.view.ActionMode.Callback
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.anime_list.view.*

class anime_adapter(val context: Context,val animelist:List<anime_model>):RecyclerView.Adapter<anime_adapter.itemview>(){
    var isEnable=false

    
    inner class itemview(view:View):RecyclerView.ViewHolder(view){
        fun setData(animeModel: anime_model){
            itemView.imageView2.setImageResource(animeModel.image)
            itemView.textView.text=animeModel.name
        }
        init{
            view.setOnClickListener {
                val intent= Intent(context,each_char::class.java)
                val charactername=itemView.textView.text
                intent.putExtra("$charactername","$charactername")
                context.startActivity(intent)
        }
    }}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemview {
       val view= LayoutInflater.from(context).inflate(R.layout.anime_list,parent,false)
        return itemview(view)
    }

    override fun onBindViewHolder(holder: itemview, position: Int) {
        val value=animelist[position]
        holder.itemView.setOnLongClickListener(View.OnLongClickListener {
            false
        })
        holder.setData(value)

    }

    override fun getItemCount(): Int {
        return animelist.size
    }
}
