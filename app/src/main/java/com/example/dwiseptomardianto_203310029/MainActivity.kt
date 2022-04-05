package com.example.dwiseptomardianto_203310029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dwiseptomardianto_203310029.adapter.ItemAdapter
import com.example.dwiseptomardianto_203310029.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // dwi septo mardianto 203310029 : untuk menginisialisasi data
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recyler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

// dwi septo mardianto 203310029 : untuk mengatur tata letak recyclerview
        recyclerView.setHasFixedSize(true)



    }
}