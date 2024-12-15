package com.brighttorchstudio.mytarotreadings.ui.read_tarot.view

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.brighttorchstudio.mytarotreadings.R
import com.brighttorchstudio.mytarotreadings.ui.theme.MyTarotReadingsTheme

@Composable
fun AskScreen(){
    val focusManager = LocalFocusManager.current
    var text = remember { mutableStateOf("") }
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column (
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(horizontal = 20.dp)
            ,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = R.drawable.crystal_ball),
                contentDescription = "crystal ball",
                modifier = Modifier.size(200.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(

                value = text.value,

                onValueChange = {input -> text.value = input},

                modifier = Modifier
                    .border(width = 2.dp, shape = CircleShape, color = MaterialTheme.colorScheme.primary)
                    .fillMaxWidth()
                ,
                shape = CircleShape,
                placeholder = {Text("Ask me something you want to know")},
                maxLines = 1,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done), // Thiết lập ImeAction
                keyboardActions = KeyboardActions(
                    onDone = {
                        focusManager.clearFocus()
                        println("press press press")


                    }
                )

            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {}) {
                Text("Read")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun AskScreenPreview(){
    MyTarotReadingsTheme {
        AskScreen()
    }
}