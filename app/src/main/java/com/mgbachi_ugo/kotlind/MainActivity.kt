package com.mgbachi_ugo.kotlind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: DetailsRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = DetailsRecyclerAdapter(this, DataService.details)
        info_view.adapter = adapter
        val layoutManager = LinearLayoutManager(this)
        info_view.layoutManager = layoutManager
        info_view.setHasFixedSize(true)
    }
}
