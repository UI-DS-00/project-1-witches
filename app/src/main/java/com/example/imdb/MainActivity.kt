package com.example.imdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.fragment.app.Fragment
import com.example.imdb.databinding.ActivityMainBinding
import com.example.imdb.databinding.ActivityStart2Binding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home_icon -> replaceFragment(HomeFragment())
                R.id.profile_icon -> replaceFragment(ProfileFragment())
                R.id.search_icon -> replaceFragment(SearchFragment())
            }
            true
        }

        // for sign in page
        val profileFragment = ProfileFragment()
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.frame_layout, profileFragment)


    }


    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }


}
