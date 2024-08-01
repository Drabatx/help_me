package com.drabatx.helpme.presentation.view.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.drabatx.helpme.R
import com.drabatx.helpme.presentation.navigation.AppScreen
import com.drabatx.helpme.presentation.view.theme.AppTypography
import com.drabatx.helpme.presentation.view.theme.margin_medium
import com.drabatx.helpme.presentation.view.theme.margin_small

@Composable
fun MenuScreen(navController: NavController) {
    Scaffold(
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxHeight()
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(0.8f)
                ) {
                    Spacer(modifier = Modifier.height(margin_medium))
                    Text(text = "Bienvenido", style = AppTypography.displaySmall)
                    Spacer(modifier = Modifier.height(margin_medium))
                    Text(text = "Help Me!", style = AppTypography.displayLarge)
                    Spacer(modifier = Modifier.height(margin_medium))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.hand_logo),
                            contentDescription = stringResource(R.string.description_images),
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .aspectRatio(1f),
                            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .padding(innerPadding)
                        .wrapContentHeight()
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    OutlinedButton(
                        onClick = { navController.navigate(AppScreen.LoginScreen.route) },
                        modifier = Modifier.fillMaxWidth(0.8f)
                    ) {
                        Text(text = stringResource(R.string.action_login))
                    }
                    Spacer(modifier = Modifier.height(margin_small))
                    Button(
                        onClick = { navController.navigate(AppScreen.SignInScreen.route) },
                        modifier = Modifier.fillMaxWidth(0.8f)
                    ) {
                        Text(text = stringResource(R.string.action_sign_in))
                    }
                    Spacer(modifier = Modifier.height(margin_medium))

                }
            }
        }
    )
}