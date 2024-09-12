package com.example.gohealthy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.gohealthy.databinding.FragmentSignupBinding
import com.example.gohealthy.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {

    lateinit var binding: FragmentWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        binding.welcomeButton.setOnClickListener {
            findNavController().navigate(R.id.welcomeToSignup)
        }

        return binding.root
    }


}