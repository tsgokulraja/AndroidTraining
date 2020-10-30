package com.example.cmandroidtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataList = ArrayList<SampleData>()
        dataList.add(SampleData(RecyclerViewSampleAdapter.VIEW_TYPE_ONE, "View 1"))
        dataList.add(SampleData(RecyclerViewSampleAdapter.VIEW_TYPE_TWO, "View 2"))
        dataList.add(SampleData(RecyclerViewSampleAdapter.VIEW_TYPE_TWO, "View 3"))
        dataList.add(SampleData(RecyclerViewSampleAdapter.VIEW_TYPE_TWO, "View 4"))
        dataList.add(SampleData(RecyclerViewSampleAdapter.VIEW_TYPE_ONE, "View 5"))
        dataList.add(SampleData(RecyclerViewSampleAdapter.VIEW_TYPE_TWO, "View 6"))
        dataList.add(SampleData(RecyclerViewSampleAdapter.VIEW_TYPE_ONE, "View 7"))
        dataList.add(SampleData(RecyclerViewSampleAdapter.VIEW_TYPE_TWO, "View 8"))
        dataList.add(SampleData(RecyclerViewSampleAdapter.VIEW_TYPE_ONE, "View 9"))
        dataList.add(SampleData(RecyclerViewSampleAdapter.VIEW_TYPE_TWO, "View 10"))
        dataList.add(SampleData(RecyclerViewSampleAdapter.VIEW_TYPE_ONE, "View 11"))
        dataList.add(SampleData(RecyclerViewSampleAdapter.VIEW_TYPE_TWO, "View 12"))

        val adapter = RecyclerViewSampleAdapter(this, dataList)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}