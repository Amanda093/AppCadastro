package com.example.appcadastro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appcadastro.ui.theme.AppCadastroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppCadastroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column(
        Modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(16.dp),
        Arrangement.Center
    ) {
        Row(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(
                text = "App Cadastro",
                color = Color.Black)
        }
        Row(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                TextFieldName = "Nome"
            )
        }
        Row(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                TextFieldName = "Endereço"
            )
        }
        Row(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                TextFieldName = "Bairro"
            )
        }
        Row(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                TextFieldName = "CEP"
            )
        }
        Row(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                TextFieldName = "Cidade"
            )
        }
        Row(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                TextFieldName = "Estado"
            )
        }
        Row(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Cadastrar")
            }
        }
    }
}

@Composable
fun TextField(TextFieldName: String) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = text,
        onValueChange = {
            text = it
        },
        label = { Text(text = TextFieldName) },
        placeholder = { Text(text = "") },
    )
}

@Preview
@Composable
fun AppPreview() {
    AppCadastroTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}