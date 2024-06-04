package com.example.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parcialtp3.R
import com.example.parcialtp3.adapters.BestDestinationAdapter
import com.example.parcialtp3.databinding.FragmentExploreBinding
import com.example.parcialtp3.providers.BestDestinationProvider

class Explore : Fragment() {

    private var _binding: FragmentExploreBinding? = null
    private val binding get() = _binding!!
    private lateinit var bestDestinationAdapter: BestDestinationAdapter



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentExploreBinding.inflate(inflater, container, false)
        val bestDestinationAdapter = BestDestinationAdapter(BestDestinationProvider.bestDestinationList)
        binding.trendingDestinations.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.trendingDestinations.adapter = bestDestinationAdapter

        return binding.root


    }


}