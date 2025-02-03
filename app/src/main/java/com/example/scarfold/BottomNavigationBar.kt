package com.example.scarfold

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.scarfold.screen.Screen

@Composable
fun BottomNavigationBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    NavigationBar {
        NavigationBarItem(
            icon = { Icon(Icons.Default.CheckCircle, contentDescription = "Список") },
            label = { Text("Список") },
            selected = currentRoute == Screen.LIST_SCREEN,
            onClick = { navController.navigate(Screen.LIST_SCREEN) }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Info, contentDescription = "Информация") },
            label = { Text("Информация") },
            selected = currentRoute == Screen.INFO_SCREEN,
            onClick = { navController.navigate(Screen.INFO_SCREEN) }
        )
    }
}