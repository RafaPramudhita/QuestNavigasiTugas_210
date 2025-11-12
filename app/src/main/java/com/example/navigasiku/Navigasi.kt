package com.example.navigasiku

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasiku.view.*

enum class Navigasi {
    Welcome,
    Detail,
    Formulir
}
@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    var nama by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }

    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Welcome.name,
            modifier = Modifier.padding(isiRuang)
        ) {



        }
    }
}