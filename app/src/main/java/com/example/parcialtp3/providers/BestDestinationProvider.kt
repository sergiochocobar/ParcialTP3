package com.example.parcialtp3.providers

import com.example.parcialtp3.R
import com.example.parcialtp3.entities.BestDestinationModel

class BestDestinationProvider{
companion object{
    val bestDestinationList = listOf<BestDestinationModel>(
        BestDestinationModel(
            "Boracay",
            "Philippines",
            "5D4N",
            R.drawable.boracay),

        BestDestinationModel(
            "Baros",
            "Maldives",
            "7D6N",
            R.drawable.baros),

        BestDestinationModel(
            "Bali",
            "Indonesia",
            "3D2N",
            R.drawable.bali),

        BestDestinationModel(
            "Palawan",
            "Philippines",
            "3D2N",
            R.drawable.palawan),
    )



}
}