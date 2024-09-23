package com.example.appstore.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface LojaDao {
    @Query("SELECT * FROM loja")
    fun getRoupas(): Flow<List<Loja>>

    @Query("SELECT * FROM loja WHERE id = :id")
    fun getRoupaById(id: Int): Flow<Loja>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRoupa(loja: Loja)

    @Delete
    suspend fun deleteRoupa(loja: Loja)
}
