package com.example.sayem.recyclerviewlistadapterasynclistdiffdemo

import android.support.v7.util.DiffUtil

/**
 * Created by sayem on 3/2/2018.
 */
open class MyDiffCallback : DiffUtil.ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item?, newItem: Item?): Boolean {
        return oldItem?.id.equals(newItem?.id)
    }

    override fun areContentsTheSame(oldItem: Item?, newItem: Item?): Boolean {
        return oldItem?.equals(newItem)!!
    }
}