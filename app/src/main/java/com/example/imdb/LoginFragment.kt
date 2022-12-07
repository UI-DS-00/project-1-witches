package com.example.imdb

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.os.Bundle
import com.example.imdb.LoginFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.imdb.R
import com.example.imdb.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private var preference: SharedPreferences? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root

        preference = this.activity?.getSharedPreferences("accounts", MODE_PRIVATE)


        binding.signInPageButton.setOnClickListener {

            findNavController().navigate(R.id.action_loginFragment2_to_profileFragment)

            // fun onClick(view: View){
                var email: String = binding.email1.text.toString().trim()
                var password: String = binding.password1.text.toString().trim()

                if (email.isNotEmpty() && password.isNotEmpty()){
                    var editor: SharedPreferences.Editor? = preference?.edit()
                    editor?.putString("email", email)
                    editor?.putString("password", password)
                    editor?.apply()
                }
           // }

        }

        return view
    }



}