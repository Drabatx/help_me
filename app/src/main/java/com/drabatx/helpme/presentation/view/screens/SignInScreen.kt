package com.drabatx.helpme.presentation.view.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.drabatx.helpme.R
import com.drabatx.helpme.presentation.navigation.AppScreen
import com.drabatx.helpme.presentation.view.theme.AppTypography
import com.drabatx.helpme.presentation.view.theme.margin_medium
import com.drabatx.helpme.presentation.view.theme.margin_small

@Composable
fun SignInScreen(navController: NavController){
    var email by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var repeatPassword by remember { mutableStateOf("") }
    Scaffold { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .fillMaxHeight()
                .imePadding(),
            verticalArrangement = Arrangement.Top
        ) {
            Column(
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth(0.8f)
                    .align(alignment = Alignment.CenterHorizontally),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.action_sign_in),
                    style = AppTypography.displayMedium
                )
                Spacer(modifier = Modifier.height(margin_medium))
                OutlinedTextField(
                    value = "",
                    onValueChange = { email = it },
                    label = { Text(text = stringResource(id = R.string.label_email)) },
                    maxLines = 1,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp)
                )

                Spacer(modifier = Modifier.height(margin_medium))
                OutlinedTextField(
                    value = "",
                    onValueChange = { username = it },
                    label = { Text(text = stringResource(id = R.string.label_username)) },
                    maxLines = 1,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp)
                )

                Spacer(modifier = Modifier.height(margin_small))

                OutlinedTextField(
                    value = "",
                    onValueChange = { password = it },
                    label = { Text(text = stringResource(id = R.string.label_password)) },
                    maxLines = 1,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp)
                )

                Spacer(modifier = Modifier.height(margin_small))
                OutlinedTextField(
                    value = "",
                    onValueChange = { repeatPassword = it },
                    label = { Text(text = stringResource(id = R.string.label_repeat_password)) },
                    maxLines = 1,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp)
                )
                Spacer(modifier = Modifier.height(margin_small))
                Button(onClick = { navController.navigate(AppScreen.LoginScreen.route) }, modifier = Modifier.fillMaxWidth()) {
                    Text(text = stringResource(R.string.action_login))
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewSignInScreen() {
    val navController = rememberNavController()
    SignInScreen(navController = navController)
}
