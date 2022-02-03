package com.funnit.thelittlemuse

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.funnit.thelittlemuse.ui.theme.TheLittleMuseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheLittleMuseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LetInspire()
                }
            }
        }
    }
}

@Composable
fun LetInspire() {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.let_inspire))
                },
                backgroundColor = colorResource(id = R.color.deep_orange),
                contentColor = colorResource(id = R.color.text_icons)
            )

        },
        content = {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.image),
                        contentDescription = stringResource(id = R.string.let_inspire)
                    )
                    Text(
                        text = stringResource(id = R.string.let_inspire),
                        color = colorResource(id = R.color.primary_color),
                        fontWeight = FontWeight.Bold,
                        fontSize = 36.sp
                    )
                }

                Text(
                    text = "Dünyayı değiştirecek insanlar, onu değiştirebileceklerini düşünecek kadar çılgın olanlardır.",
                    modifier = Modifier.padding(8.dp),
                    color = colorResource(
                        id = R.color.primary_text
                    ),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center
                )

                Button(onClick = { Log.e("Inspire", "Inspired!")},
                    colors = ButtonDefaults.buttonColors( 
                        backgroundColor = colorResource( id = R.color.amber),
                        contentColor = colorResource(id = R.color.secondary_text)
                    )) {
                    Text(text = stringResource(id = R.string.let_inspire))
                }
            }

        }
    )

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TheLittleMuseTheme {
        LetInspire()
    }
}