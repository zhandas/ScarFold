package com.example.scarfold.screen

import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.scarfold.data.ShoppingViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.dialog
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationGraph(
    modifier: androidx.compose.ui.Modifier,
    activity: ComponentActivity,
    navController: NavController
) {
    val shoppingViewModel = ViewModelProvider(
        activity as ViewModelStoreOwner,
        ShoppingViewModel.factory
    )[ShoppingViewModel::class.java]

    NavHost(
        modifier = modifier,
        navController = navController as NavHostController,
        startDestination = Screen.LIST_SCREEN
    ) {
        composable(route = Screen.LIST_SCREEN) {
            ListScreen(shoppingViewModel, navController)
        }
        composable(route = Screen.DETAIL_SCREEN) {
            DetailScreen(shoppingViewModel, navController)
        }
        composable(route = Screen.INFO_SCREEN) {
            InfoScreen(navController)
        }
    }
}