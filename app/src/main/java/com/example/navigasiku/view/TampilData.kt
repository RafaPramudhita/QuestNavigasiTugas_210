package com.example.navigasiku.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.navigasiku.Navigasi
import com.example.navigasiku.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    nama: String,
    jenisKelamin: String,
    status: String,
    alamat: String,
    onBackBtnClick: () -> Unit,
    navController: NavController? = null
) {
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), nama),
        Pair(stringResource(id = R.string.jenis_kelamin), jenisKelamin),
        Pair("STATUS PERKAWINAN", status),
        Pair(stringResource(id = R.string.alamat), alamat)
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Tampil Data", color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color(0xFF7E57C2)
                )
            )
        }
    ) { isiRuang ->

    }
}