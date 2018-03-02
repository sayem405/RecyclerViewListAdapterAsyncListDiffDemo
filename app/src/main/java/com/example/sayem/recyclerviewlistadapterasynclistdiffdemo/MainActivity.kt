package com.example.sayem.recyclerviewlistadapterasynclistdiffdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var  adapter : MyListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val adapter = MyListAdapter()
        recyclerView.adapter = adapter
        val itemList = getDataList()
        adapter.submitList(itemList)

        findViewById<Button>(R.id.buttonInsert).setOnClickListener {
                var newItemList = getDataList()
                newItemList.add(3, Item(Math.random().toString(), "new Item"))
                adapter.submitList(newItemList)

        }

        findViewById<Button>(R.id.buttonDelete).setOnClickListener {
            var newItemList = getDataList()
            newItemList.add(3, Item(Math.random().toString(), "new Item"))
            newItemList.removeAt(3);
            adapter.submitList(newItemList)

        }
    }
}
