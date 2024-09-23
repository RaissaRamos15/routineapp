package com.example.appstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.appstore.data.AppContainer
import com.example.appstore.ui.navigation.LojaNavGraph
import com.example.appstore.ui.theme.AppStoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppStoreTheme{
                val appContainer = AppContainer(applicationContext)
                val lojaRepository = appContainer.lojaRepository
                val navController = rememberNavController()
                LojaNavGraph(navController = navController, lojaRepository = lojaRepository)
            }
        }
    }
}
