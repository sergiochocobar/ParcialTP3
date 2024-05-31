package com.example.parcialtp3.creditsCardsOffers.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcialtp3.creditsCardsOffers.CreditsCardsOffers
import com.example.parcialtp3.R

class CreditCardsOffersViewHolder (view: View):RecyclerView.ViewHolder(view){

    val creditCardOfferTitle = view.findViewById<TextView>(R.id.txtDiscountCardLittleTitle)
    val creditCardOfferImg = view.findViewById<ImageView>(R.id.imgViewDiscountCardLittleCreditCard)
    fun render(creditsCardsOffersModel: CreditsCardsOffers){

        creditCardOfferTitle.text = creditsCardsOffersModel.title
        Glide.with(creditCardOfferImg.context).load(creditsCardsOffersModel.img).into(creditCardOfferImg)
    }


}