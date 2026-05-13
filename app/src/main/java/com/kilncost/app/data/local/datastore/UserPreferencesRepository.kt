package com.kilncost.app.data.local.datastore

import android.content.Context
import android.icu.util.Currency
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
        private var TIME_COST_CENTS_PER_HR = intPreferencesKey("Time_Cost_Cents_per_Hr")
        private var DEFAULT_PROFIT_MARGIN = floatPreferencesKey("Profit Margin")
        private var HAS_COMPLETED_ONBOARDING = booleanPreferencesKey("completed onboarding")
        private var CURRENCY_SYMBOL = stringPreferencesKey("currency symbol")
        private var DIMENSION_UNIT = stringPreferencesKey("Dimension unit")

    }

    val prefernces: Flow<UserSettings> = dataStore.data.map { prefs -> UserPreferences (

            )}



}