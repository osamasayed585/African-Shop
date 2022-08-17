package com.visionstech.africanshop.data.utils

import android.content.Context
import android.content.SharedPreferences
import com.visionstech.africanshop.data.utils.Constants.SharedPreferences.Companion.AUTHENTICATION_TOKEN
import com.visionstech.africanshop.data.utils.Constants.SharedPreferences.Companion.LANGUAGE
import com.visionstech.africanshop.data.utils.Constants.SharedPreferences.Companion.SHARED_PREFERENCES_NAME
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class PreferencesManager @Inject constructor(@ApplicationContext context: Context) {

    private lateinit var sharedPreferences: SharedPreferences
    init {
            context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0)
    }


    fun getLanguage(): String {
        return sharedPreferences.getString(LANGUAGE, "notSelected")!!
    }

    fun setLanguage(language: String) {
        sharedPreferences.edit().putString(LANGUAGE, language).apply()
    }


    fun getAuthenticationToken(): String {
        return sharedPreferences.getString(AUTHENTICATION_TOKEN, null)!!
    }

    fun setAuthenticationToken(token: String) {
        return sharedPreferences.edit().putString(AUTHENTICATION_TOKEN, token).apply()
    }
}