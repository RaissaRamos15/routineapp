package com.example.routineapp.data

import android.content.Context
import androidx.room.Room

class AppContainer(context: Context) {
    private val database: SchoolRoutineDatabase by lazy {
        Room.databaseBuilder(context, SchoolRoutineDatabase::class.java, "db_school_routine").build()
    }

    val routineRepository: RoutineRepository by lazy {
        RoutineRepository(database.routineDao())
    }
}
