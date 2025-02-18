package com.samsung.shrc.dtoanng.shortnews.domain.repository

import androidx.constraintlayout.utils.widget.MockView
import com.samsung.shrc.dtoanng.shortnews.domain.model.Movie
import com.samsung.shrc.dtoanng.shortnews.utils.Resource
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    suspend fun getMovieList(): Flow<Resource<List<Movie>>>
    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}