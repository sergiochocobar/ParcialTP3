package com.example.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.R
import com.example.parcialtp3.creditsCardsOffers.CreditsCardsOffers
import com.example.parcialtp3.creditsCardsOffers.adapter.CreditCardsOffersAdapter

class ListFragment : Fragment() {

    lateinit var vista: View

    lateinit var recContactos : RecyclerView

    var contactos : MutableList<CreditsCardsOffers> = ArrayList()

    private lateinit var linearLayoutManager: LinearLayoutManager

    private lateinit var contactoListAdapter: CreditCardsOffersAdapter

    companion object {
        fun newInstance() = ListFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        vista =  inflater.inflate(R.layout.offers_recycle, container, false)

        recContactos = vista.findViewById(R.id.recyclerOffers)


        return vista
    }


    override fun onStart() {
        super.onStart()
        //Creo la Lista Dinamica
        for (i in 1..2) {
            contactos.add(CreditsCardsOffers("Pedro",""))
            contactos.add(CreditsCardsOffers("Rodolfo", ""))
            contactos.add(CreditsCardsOffers("Emilio",""))
            contactos.add(CreditsCardsOffers("Luis", ""))
            contactos.add(CreditsCardsOffers("Carlos",  ""))
            contactos.add(CreditsCardsOffers("David", ""))
        }

        //Configuración Obligatoria
        requireActivity()

        recContactos.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(context)
        contactoListAdapter = CreditCardsOffersAdapter(contactos)

        recContactos.layoutManager = linearLayoutManager
        recContactos.adapter = contactoListAdapter
    }

    override fun onResume() {
        super.onResume()
    }


}
