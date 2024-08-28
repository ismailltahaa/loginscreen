package com.example.loginscreen

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {

    var emailvalue by remember { mutableStateOf("") }
    var password:String by remember { mutableStateOf("")

    }

        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){



            Image(painter = painterResource(id = R.drawable.androidparty), contentDescription = "Login screen",
                modifier = Modifier.size(200.dp))


            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "welcome back", fontSize =28.sp, fontWeight = FontWeight.Bold )

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Login to your account")

            OutlinedTextField(value = emailvalue, onValueChange ={yenideger ->
                emailvalue = yenideger
            },
                label = { Text(text = "Email adress")} )

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(value = password, onValueChange ={ yenideger ->
                password = yenideger
            }, label = { Text(text = "Password") } )

            Button(onClick = {}) {
                Text(text = "Login")
            }
            Spacer(modifier = Modifier.height(10.dp))

            TextButton(onClick = {}) {
                Text(text = "Forgot Password?")
            }

            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Or Sign in With")




        }




    }





