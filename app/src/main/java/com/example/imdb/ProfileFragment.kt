package com.example.imdb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      val v = inflater.inflate(R.layout.fragment_profile, container, false)
        return v
    }

}