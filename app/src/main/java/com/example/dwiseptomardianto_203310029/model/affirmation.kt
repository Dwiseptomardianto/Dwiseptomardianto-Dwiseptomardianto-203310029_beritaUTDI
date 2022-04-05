package com.example.dwiseptomardianto_203310029.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int) {

}