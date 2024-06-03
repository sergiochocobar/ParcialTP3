package com.example.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.adapters.BigOffersAdapter
import com.example.parcialtp3.adapters.FlightResultsAdapter
import com.example.parcialtp3.adapters.LittleOffersAdapter
import com.example.parcialtp3.databinding.FragmentFlightResultsBinding
import com.example.parcialtp3.databinding.FragmentOffersBinding
import com.example.parcialtp3.databinding.FragmentSearchBinding
import com.example.parcialtp3.providers.CreditCardsOffersProvider
import com.example.parcialtp3.providers.FlightResultsProvider

class FlightResultsFragment : Fragment() {

    private lateinit var flightResultsRecycleView: RecyclerView
    private lateinit var flightResultsAdapter: FlightResultsAdapter
    private var _binding: FragmentFlightResultsBinding? =null
    private val binding get() = _binding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =  FragmentFlightResultsBinding.inflate(inflater,container,false)

        flightResultsRecycleView = _binding!!.recyclerFlightsResults
        flightResultsRecycleView.layoutManager = LinearLayoutManager(context)
        flightResultsAdapter = FlightResultsAdapter(FlightResultsProvider.flightResultsList)

        flightResultsRecycleView.adapter = flightResultsAdapter

        return binding.root
    }

    companion object {
        fun newInstance() = Search()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}