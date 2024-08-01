package com.drabatx.helpme.presentation.view.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Scaffold(bottomBar = {
        NavigationBar(modifier = Modifier.fillMaxWidth()) {

        }
    }) { innerPadding ->

    }
}