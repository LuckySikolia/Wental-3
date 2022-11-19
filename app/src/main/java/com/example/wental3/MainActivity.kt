package com.example.wental3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wental3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //initialize the views
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)//set the content view as the binding view

        //initializing the binding class

        
//        binding.calView.setOnDateChangeListener { calendarView, i, i2, i3 ->  }

//        val calenderView = binding.root
//        setContentView(calenderView)
//
//        //referencing the views in activity_main
//        binding.calView.setOnDateChangeListener{ viewModel.userClicked()}


    }
}