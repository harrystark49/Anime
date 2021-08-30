package com.example.anime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
         var list= ArrayList<anime_model>()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView=re

        recyclerView.layoutManager=StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
        var character54=anime_model(R.drawable.ichigo,"ichigo")
        list.add(character54)
        var character1=anime_model(R.drawable.ace,"ace")
        list.add(character1)
        var character2=anime_model(R.drawable.akaahi,"akashi")
        list.add(character2)
        var character3=anime_model(R.drawable.gojo,"gojo")
        list.add(character3)
        var character554=anime_model(R.drawable.naruto,"naruto")
        list.add(character554)
        var character4=anime_model(R.drawable.itachi,"itachi")
        list.add(character4)
        var character5=anime_model(R.drawable.l,"L")
        list.add(character5)
        var character6=anime_model(R.drawable.levi,"levi")
        list.add(character6)
        var character7=anime_model(R.drawable.saitama,"saitama")
        list.add(character7)
        var character8=anime_model(R.drawable.vegeta,"vegeta")
        list.add(character8)
        var character9=anime_model(R.drawable.kilua,"kilua")
        list.add(character9)
        var character44=anime_model(R.drawable.kenkei,"kenkei")
        list.add(character44)
        val adapter=anime_adapter(this,list)
        recyclerView.adapter=adapter

    }
}