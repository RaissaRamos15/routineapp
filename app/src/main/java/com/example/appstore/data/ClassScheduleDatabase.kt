package com.example.routineapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ClassSchedule::class], version = 1, exportSchema = false)
abstract class ClassScheduleDatabase : RoomDatabase() {
    abstract fun classScheduleDao(): ClassScheduleDao
}
