package com.example.daggerdemo.dagger_mvvm.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.daggerdemo.dagger_mvvm.model.Product

@Database(entities = [Product::class], version = 1)
abstract class FakerDB : RoomDatabase() {
    abstract fun getFakerDAO(): FakerDAO
}