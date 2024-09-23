package com.example.routineapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "class_schedule")
data class ClassSchedule(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val subject: String,
    val startTime: String,
    val endTime: String,
    val location: String,
    val dayOfWeek: String
)
