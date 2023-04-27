package com.normuradov.mindful30.model

import androidx.annotation.DrawableRes

data class DailyRecommendation(
    val dayNumber: Int,
    @DrawableRes val imageId: Int,
    val teaser: String,
    val description: String,
)