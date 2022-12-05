package com.example.imdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentController
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.imdb.databinding.ActivityMainBinding
import com.example.imdb.databinding.ActivityStart2Binding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    private val navController by lazy { findNavController(R.id.fragmentContainerView)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //replaceFragment(HomeFragment())

        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController)

        /*binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home_icon -> replaceFragment(HomeFragment())
                R.id.profile_icon -> replaceFragment(ProfileFragment())
                R.id.search_icon -> replaceFragment(SearchFragment())
            }
            true
        }*/
        // for sign in page
        /*
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView3) as NavHostFragment
        navController = navHostFragment.navController

         */

    }


    /*
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
        fragmentTransaction.commit()
    }

     */


}
