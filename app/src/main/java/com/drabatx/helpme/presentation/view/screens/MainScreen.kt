package com.drabatx.helpme.presentation.view.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.drabatx.helpme.presentation.utils.AppTopLevelDestination
import com.drabatx.helpme.presentation.utils.TOP_LEVEL_DESTINATIONS

@Composable
fun MainScreen(navController: NavController) {
    Scaffold(bottomBar = {
        BottomAppNavigation("", navigationTopLevelDestination = {})
    }) { innerPadding ->
        Text(text = "", modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun BottomAppNavigation(
    selectDestination: String,
    navigationTopLevelDestination: (AppTopLevelDestination) -> Unit = { }
) {
    NavigationBar(modifier = Modifier.fillMaxWidth()) {
        TOP_LEVEL_DESTINATIONS.forEach { destinations ->
            NavigationBarItem(
                selected = selectDestination == destinations.route,
                onClick = { navigationTopLevelDestination },
                icon = {
                    Icon(
                        imageVector = destinations.selectedIcon,
                        contentDescription = stringResource(id = destinations.iconTextId)
                    )
                })
        }
    }
}