package com.example.parcialtp3.creditsCardsOffers.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.R
import com.example.parcialtp3.creditsCardsOffers.CreditsCardsOffers

class CreditCardsOffersAdapter(private val creditCardsOffersList:MutableList<CreditsCardsOffers>) : RecyclerView.Adapter<CreditCardsOffersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CreditCardsOffersViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CreditCardsOffersViewHolder(layoutInflater.inflate(R.layout.discount_card_little, parent, false))
    }

    override fun getItemCount(): Int = creditCardsOffersList.size

    override fun onBindViewHolder(holder: CreditCardsOffersViewHolder, position: Int) {
        val item = creditCardsOffersList[position]
        holder.render(item)
    }

}