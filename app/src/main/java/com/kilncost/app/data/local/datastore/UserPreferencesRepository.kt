package com.kilncost.app.data.local.datastore

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

val Context.dataStore by preferencesDataStore(name = "settings")

class UserPreferencesRepository(private val context: Context) {

    private  val dataStore = context.dataStore

    companion object{
        private val TIME_COST_CENTS_PER_HR = intPreferencesKey("Time_Cost_Cents_Per_Hr")
        private val PROFIT_MARGIN = floatPreferencesKey("Profit_Margin")
        private val HAS_COMPLETED_ONBOARDING = booleanPreferencesKey("completed_Onboarding")
        private val CURRENCY_SYMBOL = stringPreferencesKey("Currency_Symbol")
        private val DIMENSION_UNIT = stringPreferencesKey("Dimension_Unit")
        private val WEIGHT_UNIT = stringPreferencesKey("Weight_Unit")

    }

    val preferences: Flow<UserSettings> = dataStore.data.map { prefs -> UserSettings (
        prefs[TIME_COST_CENTS_PER_HR] ?: 0,
        prefs[PROFIT_MARGIN] ?: 20.0f,
        prefs[HAS_COMPLETED_ONBOARDING] ?: false,
        prefs[CURRENCY_SYMBOL] ?: "$",
        prefs[DIMENSION_UNIT] ?: "cm",
        prefs[WEIGHT_UNIT] ?: "lbs"
            )}



}