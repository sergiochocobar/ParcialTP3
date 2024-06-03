package com.example.parcialtp3.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
//import com.bumptech.glide.Glide
import com.example.parcialtp3.R
import com.example.parcialtp3.entities.CreditsCardsOffers
import com.example.parcialtp3.entities.FlightResults
import com.example.parcialtp3.holders.BigOfferHolder
import com.example.parcialtp3.holders.FlightResultsHolder
import com.example.parcialtp3.holders.LittleOfferHolder

class FlightResultsAdapter(private val flightResultsList: List<FlightResults>) :
    RecyclerView.Adapter<FlightResultsHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightResultsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fly_card, parent , false)

        return (FlightResultsHolder(view))
    }

    override fun onBindViewHolder(holder: FlightResultsHolder, position: Int) {


        val flight = flightResultsList[position]
        holder.bigTitle.text = flight.bigTitle
        holder.description.text = flight.description
        Glide.with(holder.itemView.context).load(flight.img).into(holder.img)
    }

    override fun getItemCount(): Int = flightResultsList.size


}