package com.example.sayem.recyclerviewlistadapterasynclistdiffdemo

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

/**
 * Created by sayem on 3/2/2018.
 */
class ItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    private val nameTextView : TextView = itemView.findViewById(R.id.itemName)

    fun bindData(item : Item) {
        nameTextView.text = item.name
    }
}