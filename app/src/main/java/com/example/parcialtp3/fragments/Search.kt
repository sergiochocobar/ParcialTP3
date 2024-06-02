package com.example.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.adapters.LittleOffersAdapter
import com.example.parcialtp3.databinding.FragmentSearchBinding
import com.example.parcialtp3.providers.CreditCardsOffersProvider

class Search : Fragment() {

    private lateinit var offersRecycleView: RecyclerView
    private lateinit var littleOffersAdapter: LittleOffersAdapter

    private var _binding: FragmentSearchBinding? =null
    private val binding get() = _binding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =  FragmentSearchBinding.inflate(inflater,container,false)

        offersRecycleView = _binding!!.recyclerOffers
        offersRecycleView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        littleOffersAdapter = LittleOffersAdapter(CreditCardsOffersProvider.creditCardsOffersList)

        offersRecycleView.adapter = littleOffersAdapter

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