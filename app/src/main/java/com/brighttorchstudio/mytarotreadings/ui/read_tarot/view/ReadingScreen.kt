package com.brighttorchstudio.mytarotreadings.ui.read_tarot.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.brighttorchstudio.mytarotreadings.R
import com.brighttorchstudio.mytarotreadings.ui.theme.MyTarotReadingsTheme

@Composable
fun ReadingScreen(){
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column (
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(horizontal = 20.dp)
            ,
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod"
                , style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.death_upright),
                    contentDescription = "crystal ball",
                    modifier = Modifier
                        .width(110.dp)

                )
                Image(
                    painter = painterResource(id = R.drawable.death_upright),
                    contentDescription = "crystal ball",
                    modifier = Modifier
                        .width(110.dp)

                )
                Image(
                    painter = painterResource(id = R.drawable.death_upright),
                    contentDescription = "crystal ball",
                    modifier = Modifier
                        .width(110.dp)

                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            HorizontalDivider()
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .weight(1f, false)


            ) {
                Text("Lorem ipsum dolorem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, or sit amet, consectetur adipiscing elit, sed do eiusmod")
                Text("Lorem ipsum dolorem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, or sit amet, consectetur adipiscing elit, sed do eiusmod")
                Text("Lorem ipsum dolorem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, or sit amet, consectetur adipiscing elit, sed do eiusmod")
                Text("Lorem ipsum dolorem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, or sit amet, consectetur adipiscing elit, sed do eiusmod")
                Text("Lorem ipsum dolorem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, orem ipsum dolor sit amet, or sit amet, consectetur adipiscing elit, sed do eiusmod")

            }
            Spacer(modifier = Modifier.height(20.dp))

            Button(
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally),
                onClick = {}

            ) {
                Text("Back")
            }

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ReadingScreenPreview(){
    MyTarotReadingsTheme {
        ReadingScreen()
    }
}