package com.example.activity5.view

import android.R
import androidx.annotation.experimental.Experimental
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

@OptIn(markerClass = ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<R.string> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (modifier=Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.nama), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700))
                )}
    ){  isiRuang ->
        Column(modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(width = 250.dp),
                label = {Text(text = "Nama Lengkap")},
                onValueChange = {},
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = false,
                    onClick = {item}
                )
                Text(text = item)
            }
        }
    }
    HorizontalDivider(modifier = Modifier
        .padding(all = 20.dp)
        .width(width = 250.dp),
        thickness = 1.dp,
        color = Color.Red
    )
}