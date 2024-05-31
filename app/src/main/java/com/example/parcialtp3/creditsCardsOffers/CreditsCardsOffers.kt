package com.example.parcialtp3.creditsCardsOffers

import android.os.Parcel
import android.os.Parcelable

class CreditsCardsOffers(title: String?, img: String?): Parcelable {
    var title: String = ""
    var img: String = ""

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    )

    init {
        this.title = title!!
        this.img = img!!
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(img)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CreditsCardsOffers> {
        override fun createFromParcel(parcel: Parcel): CreditsCardsOffers {
            return CreditsCardsOffers(parcel)
        }

        override fun newArray(size: Int): Array<CreditsCardsOffers?> {
            return arrayOfNulls(size)
        }
    }
}
