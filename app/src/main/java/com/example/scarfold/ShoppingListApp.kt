package com.example.scarfold

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.scarfold.screen.NavigationGraph

@Composable
fun ShoppingListApp(activity: ComponentActivity) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { paddingValues ->
        NavigationGraph(
            modifier = Modifier.padding(paddingValues),
            activity = activity,
            navController = navController
        )
    }
}