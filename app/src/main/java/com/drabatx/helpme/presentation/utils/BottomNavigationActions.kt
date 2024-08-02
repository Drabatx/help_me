package com.drabatx.helpme.presentation.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.RequestQuote
import androidx.compose.ui.graphics.vector.ImageVector
import com.drabatx.helpme.R
import com.drabatx.helpme.presentation.navigation.AppScreen

data class AppTopLevelDestination(
    val route: String,
    val selectedIcon: ImageVector,
    val iconTextId: Int
)

val TOP_LEVEL_DESTINATIONS = listOf(
    AppTopLevelDestination(
        route = AppScreen.MenuScreen.route,
        selectedIcon = Icons.Default.RequestQuote,
        iconTextId = R.string.bottom_menu_option_request
    ),
    AppTopLevelDestination(
        route = AppScreen.MenuScreen.route,
        selectedIcon = Icons.Default.Home,
        iconTextId = R.string.bottom_menu_option_main
    ),
    AppTopLevelDestination(
        route = AppScreen.MenuScreen.route,
        selectedIcon = Icons.Default.History,
        iconTextId = R.string.bottom_menu_option_history_alarms
    )
)