package com.example.wental3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.wental3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    //initialize the views
    private lateinit var binding: ActivityMainBinding

    //for fab (floating action button)
//    lateinit var fab: FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)       //set the content view as the binding view\\

        //when app is launched for the first time show the home fragment
        replaceFragment(CalenderFragment())

        //implementing on click events for the nav bar
        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.calender -> replaceFragment(CalenderFragment())
                R.id.journal -> replaceFragment(JournalFragment())
                R.id.stats -> replaceFragment(StatsFragment())
                R.id.settings -> replaceFragment(SettingsFragment())

                else -> {

                }

            }
            true
        }
    }

        private fun replaceFragment(fragment: Fragment){
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.calViewFragment, fragment)
            fragmentTransaction.commit()
        }

    }


