package com.drabatx.helpme.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.drabatx.helpme.presentation.view.screens.LoginScreen
import com.drabatx.helpme.presentation.view.screens.MainScreen
import com.drabatx.helpme.presentation.view.screens.MenuScreen
import com.drabatx.helpme.presentation.view.screens.SignInScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.MenuScreen.route) {
        composable(route = AppScreen.MenuScreen.route){
            MenuScreen(navController)
        }
        composable(route = AppScreen.LoginScreen.route){
            LoginScreen(navController)
        }
        composable(route = AppScreen.SignInScreen.route){
            SignInScreen(navController)
        }
        composable(route = AppScreen.MainScreen.route){
            MainScreen(navController)
        }

    }
}