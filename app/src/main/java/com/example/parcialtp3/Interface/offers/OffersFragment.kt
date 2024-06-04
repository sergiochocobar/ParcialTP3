package com.example.parcialtp3.Interface.offers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.parcialtp3.R


class OffersFragment : Fragment() {

    companion object {
        fun newInstance() = OffersFragment()
    }
    private var favorite = false

    private val viewModel: OffersViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       val view = inflater.inflate(R.layout.fragment_tarjetas, container, false)

        val corazon = view.findViewById<ImageButton>(R.id.corazonSinRelleno)
        val corazon2 = view.findViewById<ImageButton>(R.id.corazonConRelleno)


        corazon.setOnClickListener{
            favorite = !favorite


            if (favorite) {
                corazon.setImageResource(R.drawable.corazon_sin_relleno)
            } else {
                corazon.setImageResource(R.drawable.corazon_lleno)
            }
        }
        corazon2.setOnClickListener{
            favorite = !favorite


            if (favorite) {
                corazon2.setImageResource(R.drawable.corazon_sin_relleno)
            } else {
                corazon2.setImageResource(R.drawable.corazon_lleno)
            }
        }




        return view
    }

}