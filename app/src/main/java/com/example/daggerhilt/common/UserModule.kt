package com.example.daggerhilt.common

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

//@InstallIn(FragmentComponent::class)
//@InstallIn(ActivityComponent::class)
@InstallIn(SingletonComponent::class)
@Module
class UserModule {

    @Provides
    @FirebaseQualifier
    fun providesUserRepository(): UserRepository {
        return FirebaseRepository()
    }

//    @Binds
//    abstract fun provideSQLRepository(sqlRepository: SQLRepository): UserRepository

    @Provides
    @Named("SQL")
    fun provideSQLRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }

}