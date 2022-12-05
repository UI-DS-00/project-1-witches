package com.example.imdb

import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.imdb.R

class SignUpFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign__up_, container, false)


        val button = view.findViewById<Button>(R.id.sign_up_page_button)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_profileFragment)
        }
        return view
    }


}