package com.example.recyclerviewofwednesday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvSaudiCity: RecyclerView
    lateinit var cities: ArrayList<String>
    lateinit var cityName: EditText
    lateinit var ent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvSaudiCity= findViewById(R.id.rvCity)
        cityName= findViewById(R.id.theName)
        ent= findViewById(R.id.button2)
        cities= ArrayList()
        cities.add("Saudi Arabian Cities")
        cities.add("Riyadh")
        rvSaudiCity.adapter = RVSaudiCity(cities)
        rvSaudiCity.layoutManager = LinearLayoutManager(this)
        ent.setOnClickListener{
            cities.add("${cityName.text}")
            rvSaudiCity.adapter?.notifyDataSetChanged()
        }
    }
}