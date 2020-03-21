package com.mgbachi_ugo.kotlind

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DetailsRecyclerAdapter(val context: Context, val details: List<Details>) : RecyclerView.Adapter<DetailsRecyclerAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.item_setup, parent, false)
        return Holder(view)

    }

    override fun getItemCount(): Int {
        return details.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindDetail(details[position], context)

    }
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val detail = itemView.findViewById<TextView>(R.id.content_textView)
        val info = itemView.findViewById<TextView>(R.id.info_textView)

        fun bindDetail(details: Details,context: Context) {
            detail?.text = details.content
            info?.text = details.info
        }

    }
}