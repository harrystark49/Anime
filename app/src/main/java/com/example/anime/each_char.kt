package com.example.anime

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.eachchar.*

class each_char:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bundle: Bundle? =intent.extras
        val character_name=bundle!!.get("ace").toString()
        val character_name1=bundle!!.get("gojo").toString()
        val character_name2=bundle!!.get("naruto").toString()
        val character_name3=bundle!!.get("ichigo").toString()
        val character_name4=bundle!!.get("akashi").toString()
        val character_name5=bundle!!.get("itachi").toString()
        val character_name6=bundle!!.get("L").toString()
        val character_name7=bundle!!.get("levi").toString()
        val character_name8=bundle!!.get("saitama").toString()
        val character_name9=bundle!!.get("vegeta").toString()
        val character_name10=bundle!!.get("kenkei").toString()
        val character_name11=bundle!!.get("kilua").toString()

        setContentView(R.layout.eachchar)
        val recyclerView = each_char_recyclerview
        if(character_name1=="gojo"){

            var list = ArrayList<anime_model>()

            recyclerView.layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            var character1 = anime_model(R.drawable.gojo1, "gojo_satoru1")
            list.add(character1)
            var character2 = anime_model(R.drawable.gojo2, "gojo_satoru2")
            list.add(character2)
            var character3 = anime_model(R.drawable.gojo3, "gojo_satoru3")
            list.add(character3)
            var character4 = anime_model(R.drawable.gojo4, "gojo_satoru4")
            list.add(character4)
            var character5 = anime_model(R.drawable.gojo5, "gojo_satoru5")
            list.add(character5)
            var character6 = anime_model(R.drawable.gojo6, "gojo_satoru6")
            list.add(character6)
            var character7 = anime_model(R.drawable.gojo7, "gojo_satoru7")
            list.add(character7)
            var character8= anime_model(R.drawable.gojo8, "gojo_satoru8")
            list.add(character8)
            var character9 = anime_model(R.drawable.gojo9, "gojo_satoru9")
            list.add(character9)
            var character10 = anime_model(R.drawable.gojo10, "gojo_satoru10")
            list.add(character10)
            var character11 = anime_model(R.drawable.gojo11, "gojo_satoru")
            list.add(character11)
            val adapter = eachClass(this, list)
            recyclerView.adapter = adapter
        }
        if(character_name=="ace") {
            setContentView(R.layout.eachchar)
            var list = ArrayList<anime_model>()
            val recyclerView = each_char_recyclerview
            recyclerView.layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            var character10 = anime_model(R.drawable.ace10, "ace")
            list.add(character10)
            var character6 = anime_model(R.drawable.ace6, "ace")
            list.add(character6)
            var character11 = anime_model(R.drawable.ace11, "ace")
            list.add(character11)
            var character4 = anime_model(R.drawable.ace4, "ace")
            list.add(character4)
            var character1 = anime_model(R.drawable.ace, "ace")
            list.add(character1)
            var character2 = anime_model(R.drawable.ace2, "ace")
            list.add(character2)
            var character3 = anime_model(R.drawable.ace1, "ace")
            list.add(character3)
            var character5 = anime_model(R.drawable.ace5, "ace")
            list.add(character5)
            var character7 = anime_model(R.drawable.ace7, "ace")
            list.add(character7)
            var character8 = anime_model(R.drawable.ace8, "ace")
            list.add(character8)
            var character9 = anime_model(R.drawable.ace9, "ace")
            list.add(character9)
            val adapter = eachClass(this, list)
            recyclerView.adapter = adapter
        }
        if(character_name2=="naruto") {
            setContentView(R.layout.eachchar)
            var list = ArrayList<anime_model>()
            val recyclerView = each_char_recyclerview
            recyclerView.layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            var character10 = anime_model(R.drawable.naruto10, "naruto")
            list.add(character10)
            var character6 = anime_model(R.drawable.naruto6, "naruto")
            list.add(character6)
            var character4= anime_model(R.drawable.naruto4, "naruto")
            list.add(character4)
            var character1 = anime_model(R.drawable.naruto1, "naruto")
            list.add(character1)
            var character2 = anime_model(R.drawable.naruto2, " naruto")
            list.add(character2)
            var character3 = anime_model(R.drawable.naruto3, "naruto")
            list.add(character3)
            var character5 = anime_model(R.drawable.naruto5, "naruto")
            list.add(character5)
            var character7 = anime_model(R.drawable.naruto7, "naruto")
            list.add(character7)
            var character8 = anime_model(R.drawable.naruto8, "naruto")
            list.add(character8)
            var character9 = anime_model(R.drawable.naruto9, "naruto")
            list.add(character9)
            val adapter = eachClass(this, list)
            recyclerView.adapter = adapter
        }
        if(character_name3=="ichigo") {
            setContentView(R.layout.eachchar)
            var list = ArrayList<anime_model>()
            val recyclerView = each_char_recyclerview
            recyclerView.layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

            var character10 = anime_model(R.drawable.kurosaki10, "naruto")
            list.add(character10)
            var character6 = anime_model(R.drawable.kurosaki, "naruto")
            list.add(character6)
            var character4= anime_model(R.drawable.kurosaki4, "naruto")
            list.add(character4)
            var character1 = anime_model(R.drawable.kurosaki1, "naruto")
            list.add(character1)
            var character2 = anime_model(R.drawable.kurosaki2, " naruto")
            list.add(character2)
            var character3 = anime_model(R.drawable.kurosaki3, "naruto")
            list.add(character3)
            var character5 = anime_model(R.drawable.kurosaki5, "naruto")
            list.add(character5)
            var character7 = anime_model(R.drawable.kurosaki7, "naruto")
            list.add(character7)
            var character8 = anime_model(R.drawable.kurosaki8, "naruto")
            list.add(character8)
            var character9 = anime_model(R.drawable.kurosaki9, "naruto")
            list.add(character9)
            val adapter = eachClass(this, list)
            recyclerView.adapter = adapter
        }
        if(character_name4=="akashi") {
            setContentView(R.layout.eachchar)
            var list = ArrayList<anime_model>()
            val recyclerView = each_char_recyclerview
            recyclerView.layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

            var character10 = anime_model(R.drawable.akashi10, "naruto")
            list.add(character10)
            var character6 = anime_model(R.drawable.akashi6, "naruto")
            list.add(character6)
            var character4= anime_model(R.drawable.akashi4, "naruto")
            list.add(character4)
            var character1 = anime_model(R.drawable.akaahi, "naruto")
            list.add(character1)
            var character2 = anime_model(R.drawable.akashi2, " naruto")
            list.add(character2)
            var character3 = anime_model(R.drawable.akashi3, "naruto")
            list.add(character3)
            var character5 = anime_model(R.drawable.akashi5, "naruto")
            list.add(character5)
            var character7 = anime_model(R.drawable.akashi7, "naruto")
            list.add(character7)
            var character8 = anime_model(R.drawable.akashi8, "naruto")
            list.add(character8)
            var character9 = anime_model(R.drawable.akashi9, "naruto")
            list.add(character9)
            val adapter = eachClass(this, list)
            recyclerView.adapter = adapter
        }
        if(character_name5=="itachi") {
            setContentView(R.layout.eachchar)
            var list = ArrayList<anime_model>()
            val recyclerView = each_char_recyclerview
            recyclerView.layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            var character10 = anime_model(R.drawable.itachi1, "naruto")
            list.add(character10)
            var character6 = anime_model(R.drawable.itachi2, "naruto")
            list.add(character6)
            var character4= anime_model(R.drawable.itachi3, "naruto")
            list.add(character4)
            var character1 = anime_model(R.drawable.itachi4, "naruto")
            list.add(character1)
            var character2 = anime_model(R.drawable.itachi5, " naruto")
            list.add(character2)
            var character3 = anime_model(R.drawable.itachi6, "naruto")
            list.add(character3)
            var character5 = anime_model(R.drawable.itachi7, "naruto")
            list.add(character5)
            var character7 = anime_model(R.drawable.itachi8, "naruto")
            list.add(character7)
            var character9 = anime_model(R.drawable.itachi10, "naruto")
            list.add(character9)
            var character8 = anime_model(R.drawable.itachi9, "naruto")
            list.add(character8)
            val adapter = eachClass(this, list)
            recyclerView.adapter = adapter
        }
        if(character_name6=="L") {
            setContentView(R.layout.eachchar)
            var list = ArrayList<anime_model>()
            val recyclerView = each_char_recyclerview
            recyclerView.layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            var character10 = anime_model(R.drawable.l1, "naruto")
            list.add(character10)
            var character6 = anime_model(R.drawable.l2, "naruto")
            list.add(character6)
            var character4= anime_model(R.drawable.l3, "naruto")
            list.add(character4)
            var character1 = anime_model(R.drawable.l4, "naruto")
            list.add(character1)
            var character2 = anime_model(R.drawable.l5, " naruto")
            list.add(character2)
            var character3 = anime_model(R.drawable.l6, "naruto")
            list.add(character3)
            var character5 = anime_model(R.drawable.l7, "naruto")
            list.add(character5)
            var character7 = anime_model(R.drawable.l8, "naruto")
            list.add(character7)
            var character9 = anime_model(R.drawable.l10, "naruto")
            list.add(character9)
            var character8 = anime_model(R.drawable.l9, "naruto")
            list.add(character8)
            val adapter = eachClass(this, list)
            recyclerView.adapter = adapter
        }
        if(character_name6=="L") {
            setContentView(R.layout.eachchar)
            var list = ArrayList<anime_model>()
            val recyclerView = each_char_recyclerview
            recyclerView.layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            var character10 = anime_model(R.drawable.l1, "naruto")
            list.add(character10)
            var character6 = anime_model(R.drawable.l2, "naruto")
            list.add(character6)
            var character4= anime_model(R.drawable.l3, "naruto")
            list.add(character4)
            var character1 = anime_model(R.drawable.l4, "naruto")
            list.add(character1)
            var character2 = anime_model(R.drawable.l5, " naruto")
            list.add(character2)
            var character3 = anime_model(R.drawable.l6, "naruto")
            list.add(character3)
            var character5 = anime_model(R.drawable.l7, "naruto")
            list.add(character5)
            var character7 = anime_model(R.drawable.l8, "naruto")
            list.add(character7)
            var character9 = anime_model(R.drawable.l10, "naruto")
            list.add(character9)
            var character8 = anime_model(R.drawable.l9, "naruto")
            list.add(character8)
            val adapter = eachClass(this, list)
            recyclerView.adapter = adapter
        }
        if(character_name7=="levi") {
            setContentView(R.layout.eachchar)
            var list = ArrayList<anime_model>()
            val recyclerView = each_char_recyclerview
            recyclerView.layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            var character10 = anime_model(R.drawable.levi1, "naruto")
            list.add(character10)
            var character6 = anime_model(R.drawable.levi2, "naruto")
            list.add(character6)
            var character4= anime_model(R.drawable.levi3, "naruto")
            list.add(character4)
            var character1 = anime_model(R.drawable.levi4, "naruto")
            list.add(character1)
            var character2 = anime_model(R.drawable.levi5, " naruto")
            list.add(character2)
            var character3 = anime_model(R.drawable.levi6, "naruto")
            list.add(character3)
            var character5 = anime_model(R.drawable.levi7, "naruto")
            list.add(character5)
            var character7 = anime_model(R.drawable.levi8, "naruto")
            list.add(character7)
            var character9 = anime_model(R.drawable.levi10, "naruto")
            list.add(character9)
            var character8 = anime_model(R.drawable.levi9, "naruto")
            list.add(character8)
            val adapter = eachClass(this, list)
            recyclerView.adapter = adapter
        }
        if(character_name8=="saitama") {
            setContentView(R.layout.eachchar)
            var list = ArrayList<anime_model>()
            val recyclerView = each_char_recyclerview
            recyclerView.layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            var character10 = anime_model(R.drawable.saitama1, "naruto")
            list.add(character10)
            var character6 = anime_model(R.drawable.saitama2, "naruto")
            list.add(character6)
            var character4= anime_model(R.drawable.saitama3, "naruto")
            list.add(character4)
            var character1 = anime_model(R.drawable.saitama4, "naruto")
            list.add(character1)
            var character2 = anime_model(R.drawable.saitama5, " naruto")
            list.add(character2)
            var character3 = anime_model(R.drawable.saitama6, "naruto")
            list.add(character3)
            var character5 = anime_model(R.drawable.saitama7, "naruto")
            list.add(character5)
            var character7 = anime_model(R.drawable.saitama8, "naruto")
            list.add(character7)
            var character9 = anime_model(R.drawable.saitama9, "naruto")
            list.add(character9)
            var character8 = anime_model(R.drawable.saitama10, "naruto")
            list.add(character8)
            val adapter = eachClass(this, list)
            recyclerView.adapter = adapter
        }
        if(character_name9=="vegeta") {
            setContentView(R.layout.eachchar)
            var list = ArrayList<anime_model>()
            val recyclerView = each_char_recyclerview
            recyclerView.layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            var character10 = anime_model(R.drawable.vegeta1, "naruto")
            list.add(character10)
            var character6 = anime_model(R.drawable.vegeta2, "naruto")
            list.add(character6)
            var character4= anime_model(R.drawable.vegeta3, "naruto")
            list.add(character4)
            var character1 = anime_model(R.drawable.vegeta4, "naruto")
            list.add(character1)
            var character2 = anime_model(R.drawable.vegeta5, " naruto")
            list.add(character2)
            var character3 = anime_model(R.drawable.vegeta6, "naruto")
            list.add(character3)
            var character5 = anime_model(R.drawable.vegeta7, "naruto")
            list.add(character5)
            var character7 = anime_model(R.drawable.vegeta8, "naruto")
            list.add(character7)
            var character9 = anime_model(R.drawable.vegeta9, "naruto")
            list.add(character9)
            var character8 = anime_model(R.drawable.vegeta10, "naruto")
            list.add(character8)
            val adapter = eachClass(this, list)
            recyclerView.adapter = adapter
        }
        if(character_name10=="kenkei") {
            setContentView(R.layout.eachchar)
            var list = ArrayList<anime_model>()
            val recyclerView = each_char_recyclerview
            recyclerView.layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            var character10 = anime_model(R.drawable.kenkei1, "naruto")
            list.add(character10)
            var character6 = anime_model(R.drawable.kenkei2, "naruto")
            list.add(character6)
            var character4= anime_model(R.drawable.kenkei3, "naruto")
            list.add(character4)
            var character1 = anime_model(R.drawable.kenkei4, "naruto")
            list.add(character1)
            var character2 = anime_model(R.drawable.kenkei5, " naruto")
            list.add(character2)
            var character3 = anime_model(R.drawable.kenkei6, "naruto")
            list.add(character3)
            var character5 = anime_model(R.drawable.kenkei7, "naruto")
            list.add(character5)
            var character7 = anime_model(R.drawable.kenkei8, "naruto")
            list.add(character7)
            var character9 = anime_model(R.drawable.kenkei9, "naruto")
            list.add(character9)
            var character8 = anime_model(R.drawable.kenkei10, "naruto")
            list.add(character8)
            val adapter = eachClass(this, list)
            recyclerView.adapter = adapter
        }
        if(character_name11=="kilua") {
            setContentView(R.layout.eachchar)
            var list = ArrayList<anime_model>()
            val recyclerView = each_char_recyclerview
            recyclerView.layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            var character10 = anime_model(R.drawable.kilua1, "naruto")
            list.add(character10)
            var character6 = anime_model(R.drawable.kilua2, "naruto")
            list.add(character6)
            var character4= anime_model(R.drawable.kilua3, "naruto")
            list.add(character4)
            var character1 = anime_model(R.drawable.kilua4, "naruto")
            list.add(character1)
            var character2 = anime_model(R.drawable.kilua5, " naruto")
            list.add(character2)
            var character3 = anime_model(R.drawable.kilua6, "naruto")
            list.add(character3)
            var character5 = anime_model(R.drawable.kilua7, "naruto")
            list.add(character5)
            var character7 = anime_model(R.drawable.kilua8, "naruto")
            list.add(character7)
            var character9 = anime_model(R.drawable.kilua9, "naruto")
            list.add(character9)
            var character8 = anime_model(R.drawable.kilua10, "naruto")
            list.add(character8)
            val adapter = eachClass(this, list)
            recyclerView.adapter = adapter
        }
        }
    }
