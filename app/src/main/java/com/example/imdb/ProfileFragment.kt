package com.example.imdb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.imdb.databinding.ActivityMainBinding


class ProfileFragment : Fragment(R.layout.fragment_profile) {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view =  inflater.inflate(R.layout.fragment_profile, container, false)


       return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.sign_in_button)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_loginFragment2)
        }

        //new for test sign up page
        val button2 = view.findViewById<Button>(R.id.sign_up_button)
        button2.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_signUpFragment)
        }


    }

}