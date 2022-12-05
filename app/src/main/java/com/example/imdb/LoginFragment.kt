package com.example.imdb

import android.os.Bundle
import com.example.imdb.LoginFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.imdb.R

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)


        val button = view.findViewById<Button>(R.id.sign_in_page_button)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment2_to_profileFragment)
        }


        return view
    }
}