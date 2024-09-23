package com.example.routineapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.routineapp.data.RoutineRepository
import com.example.routineapp.data.Routine
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class RoutineViewModel(private val repository: RoutineRepository) : ViewModel() {

    // Fetch the list of routines
    val routineList: Flow<List<Routine>> = repository.getRoutines()

    // Fetch a routine by ID
    fun getRoutineById(id: Int): Flow<Routine> = repository.getRoutineById(id)

    // Add or update a routine
    fun addOrUpdateRoutine(id: Int? = null, subject: String, time: String, day: String, description: String) {
        val routine = Routine(id = id ?: 0, subject = subject, time = time, day = day, description = description)
        viewModelScope.launch {
            repository.insertRoutine(routine)
        }
    }

    // Delete a routine
    fun deleteRoutine(routine: Routine) {
        viewModelScope.launch {
            repository.deleteRoutine(routine)
        }
    }
}
