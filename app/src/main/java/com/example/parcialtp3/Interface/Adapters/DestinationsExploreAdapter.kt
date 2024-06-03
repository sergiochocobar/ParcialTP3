package com.example.probandovista2.Interface.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial.ui.Entidades.DestinosExplore
import com.example.probandovista2.R


class DestinationsExploreAdapter(private val destinations: List<DestinosExplore>) :
    RecyclerView.Adapter<DestinationsExploreAdapter.DestinationViewHolder>() {

    inner class DestinationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.item_name)
        val placeTextView: TextView = itemView.findViewById(R.id.item_location)
        val durationTextView: TextView = itemView.findViewById(R.id.item_duration)
        val imageView: ImageView = itemView.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.destinos_explore, parent, false)
        return DestinationViewHolder(view)
    }

    override fun onBindViewHolder(holder: DestinationViewHolder, position: Int) {
        val destination = destinations[position]
        holder.nameTextView.text = destination.nombre
        holder.placeTextView.text = destination.lugar
        holder.durationTextView.text = destination.duracion
        holder.imageView.setImageResource(destination.imagen)
    }

    override fun getItemCount(): Int {
        return destinations.size
    }
}