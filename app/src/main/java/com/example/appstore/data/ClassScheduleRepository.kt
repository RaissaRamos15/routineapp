package com.example.appstore.data

import kotlinx.coroutines.flow.Flow

open class LojaRepository(private val lojaDao: LojaDao) {
    fun getRoupas(): Flow<List<Loja>> = lojaDao.getRoupas()

    fun getRoupaById(id: Int): Flow<Loja> = lojaDao.getRoupaById(id)

    suspend fun insertRoupa(loja: Loja) = lojaDao.insertRoupa(loja)

    suspend fun deleteRoupa(loja: Loja) = lojaDao.deleteRoupa(loja)
}
