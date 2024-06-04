package com.example.parcialtp3.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcialtp3.R
import com.example.parcialtp3.entities.BestDestinationModel

class BestDestinationHolder (view: View) : RecyclerView.ViewHolder(view)  {

    val title = view.findViewById<TextView>(R.id.txtViewBestDestinationTitleItem)
    val description = view.findViewById<TextView>(R.id.txtViewBestDestinationDescItem)
    val code = view.findViewById<TextView>(R.id.txtViewBestDestinationCodeItem)
    val image = view.findViewById<ImageView>(R.id.imgViewBestDestinationItem)


    fun render(model: BestDestinationModel){
        title.text = model.title
        description.text = model.description
        code.text = model.code
        Glide.with(image.context).load(model.imageResId).into(image)

    }
}