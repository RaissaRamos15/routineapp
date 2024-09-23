package com.example.routineapp.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ClassScheduleDao {
    @Query("SELECT * FROM class_schedule")
    fun getAllClasses(): Flow<List<ClassSchedule>>

    @Query("SELECT * FROM class_schedule WHERE id = :id")
    fun getClassById(id: Int): Flow<ClassSchedule>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClass(classSchedule: ClassSchedule)

    @Delete
    suspend fun deleteClass(classSchedule: ClassSchedule)
}
