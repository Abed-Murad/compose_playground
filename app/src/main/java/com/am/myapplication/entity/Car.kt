package com.am.myapplication.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Car(val name: String, val country: String):Parcelable