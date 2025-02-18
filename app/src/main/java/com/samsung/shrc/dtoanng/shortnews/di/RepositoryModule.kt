package com.samsung.shrc.dtoanng.shortnews.di

import com.samsung.shrc.dtoanng.shortnews.domain.repository.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMovieList(): MovieRepository
}