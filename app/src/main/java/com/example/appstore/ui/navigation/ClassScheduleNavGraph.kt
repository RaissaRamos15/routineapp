package com.example.routineapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.routineapp.data.ClassScheduleRepository
import com.example.routineapp.ui.HomeScreen
import com.example.routineapp.ui.ClassScheduleScreen
import com.example.routineapp.ui.ClassScheduleViewModel
import com.example.routineapp.ui.ClassScheduleViewModelFactory

@Composable
fun ClassScheduleNavGraph(navController: NavHostController, classScheduleRepository: ClassScheduleRepository) {
    val viewModel: ClassScheduleViewModel = viewModel(factory = ClassScheduleViewModelFactory(classScheduleRepository))

    NavHost(navController, startDestination = "homeScreen") {
        composable("classScheduleScreen") { ClassScheduleScreen(viewModel) }
        composable("homeScreen") { HomeScreen(navController) }
    }
}
