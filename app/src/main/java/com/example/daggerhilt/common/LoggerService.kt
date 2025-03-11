package com.example.daggerhilt.common

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor() {

    fun log(message: String) {
        Log.e("BINDI_TAG", message )
    }
}