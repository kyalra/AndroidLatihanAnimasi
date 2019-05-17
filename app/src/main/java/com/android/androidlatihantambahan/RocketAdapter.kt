package com.android.androidlatihantambahan

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class RocketAdapter(private val context:Context,private val item:List<RocketAnimationonItem>)
    :RecyclerView.Adapter<RocketAdapter.RocketViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RocketAdapter.RocketViewHolder {
        val view=LayoutInflater.from(p0.context)
            .inflate(android.R.layout.simple_list_item_1,p0,false)

        return RocketViewHolder(view)
    }

    override fun getItemCount(): Int =item.size

    override fun onBindViewHolder(p0: RocketAdapter.RocketViewHolder, p1: Int) {
        p0.title.text=item[p1].title
        p0.setTitleOnClickListener(context,item)
    }
    class RocketViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val title:TextView=itemView.findViewById(android.R.id.text1)

        fun setTitleOnClickListener(context: Context,
                                    item: List<RocketAnimationonItem>){
            title.setOnClickListener { context.startActivity(
                item[adapterPosition].intent
            ) }
        }
    }
}