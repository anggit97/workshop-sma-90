package com.anggitprayogo.alchemist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //Step 1 : Deklarasi list adapter
    private val adapter: ListAdapter by lazy {
        ListAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Step 2 : Deklarasi Recyclerview
        val recyclerView = findViewById<RecyclerView>(R.id.rvList)


        //Step 3: Setting Recyclerview
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter

        //Step 4: masukkan data ke adapter untuk ditampilkan
        adapter.setItems(DataGenerator.generateData().toMutableList())
    }
}