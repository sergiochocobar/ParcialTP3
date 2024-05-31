package com.example.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.parcialtp3.R


class Intro2Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_intro2, container, false)

        val btnNavigate = root.findViewById<Button>(R.id.btnIntro)

        btnNavigate.setOnClickListener{
            findNavController().navigate(R.id.action_intro2Fragment_to_searchFlightFragment)
        }

        return root
    }

}