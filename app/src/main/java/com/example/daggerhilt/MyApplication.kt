package com.example.daggerhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MyApplication : Application() {

//    @Inject
//    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()

//        userRepository.saveUser("abc.@gmail.com", "123")
    }
}