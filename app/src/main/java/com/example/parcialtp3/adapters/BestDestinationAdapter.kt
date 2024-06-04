package com.example.parcialtp3.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.R
import com.example.parcialtp3.entities.BestDestinationModel
import com.example.parcialtp3.holders.BestDestinationHolder

class BestDestinationAdapter (private val bestDestinationlist: List<BestDestinationModel>) : RecyclerView.Adapter<BestDestinationHolder>() {



        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestDestinationHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return BestDestinationHolder(layoutInflater.inflate(R.layout.best_destination_item, parent, false))
        }
        override fun getItemCount(): Int = bestDestinationlist.size

        override fun onBindViewHolder(holder: BestDestinationHolder, position: Int) {
            val bestDestination = bestDestinationlist[position]
            holder.render(bestDestination)
        }

    }
