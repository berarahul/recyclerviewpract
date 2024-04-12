 package com.example.recyclerviewpract2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

 lateinit var myrecyclerview: RecyclerView
 lateinit var  myarraylist: ArrayList<data>
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        myrecyclerview=findViewById(R.id.recyclerView)
        val icon= arrayOf(R.drawable.java,R.drawable.java,R.drawable.java,R.drawable.java)
        val text= arrayOf("java","java","kotlin","c++")
       myrecyclerview.layoutManager=LinearLayoutManager(this)
        myarraylist= arrayListOf<data>()
        for (index in icon.indices){
            val eachindex=data(icon[index],text[index])
            myarraylist.add(eachindex)
        }
         myrecyclerview.adapter=MyAdapter(myarraylist,this)
    }
}