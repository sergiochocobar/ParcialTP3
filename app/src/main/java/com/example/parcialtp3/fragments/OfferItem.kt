package com.example.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.parcialtp3.R

class OfferItem : Fragment() {

    lateinit var vista: View
    lateinit var info: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.discount_card_little, container, false)
        info = vista.findViewById(R.id.txtDiscountCardLittleTitle)
        return vista;
    }

    override fun onStart() {
        super.onStart()


    }

}