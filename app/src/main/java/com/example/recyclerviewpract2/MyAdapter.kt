package com.example.recyclerviewpract2

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var myarraylist: ArrayList<data>, var context: Activity):
RecyclerView.Adapter<MyAdapter.MyViewHolder>()
{
    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
          val img=itemView.findViewById<ImageView>(R.id.imageView)
        val teext=itemView.findViewById<TextView>(R.id.textView)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
      val itemview=LayoutInflater.from(parent.context).inflate(R.layout.mylayout,parent,false)
        return MyViewHolder(itemview)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
     val currentitem=myarraylist[position]
        holder.img.setImageResource(currentitem.img)
        holder.teext.text=currentitem.launguage
    }

    override fun getItemCount(): Int {
        return myarraylist.size
    }
}