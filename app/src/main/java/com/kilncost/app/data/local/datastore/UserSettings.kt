package com.kilncost.app.data.local.datastore

data class UserSettings(
    val timeCostPerHrCents: Int,
    val profitMargin: Float,
    val onboarded: Boolean,
    val currencySymbol: String,
    val dimensionUnit: String,
    val weightUnit: String
)