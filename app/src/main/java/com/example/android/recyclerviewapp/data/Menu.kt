package com.example.android.recyclerviewapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Menu (
    var nama : String,
    var kategori : String,
    var harga : Int
) : Parcelable {
    val deskripsi: String
        get() = "Ini adalah $nama"
}