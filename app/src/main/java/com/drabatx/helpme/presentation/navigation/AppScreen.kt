package com.drabatx.helpme.presentation.navigation

import androidx.annotation.StringRes
import com.drabatx.helpme.R

sealed class AppScreen(val route: String, @StringRes val resourceId: Int) {
    data object MenuScreen : AppScreen("menu_options", R.string.screen_menu)
    data object LoginScreen : AppScreen("login_screen", R.string.screen_login)
    data object SignInScreen : AppScreen("sign_in_screen", R.string.screen_sign_in)
    data object MainScreen : AppScreen("main_screen", R.string.screen_main)
    data object RequestsScreen : AppScreen("requests_screen", R.string.screen_request)
    data object HistoryAlarmScreen :
        AppScreen("history_alarm_screen", R.string.screen_history_alarms)
}