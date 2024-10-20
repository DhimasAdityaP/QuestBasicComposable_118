package com.example.p2_basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.collection.intIntMapOf
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.I
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p2_basiccompose.ui.theme.P2_BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P2_BasicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicLayout(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicLayout( modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Login",
            style = TextStyle(fontSize = 50.sp,
                fontWeight = FontWeight.Bold))
            Text(text = "Ini adalah Halaman Login")
        Image(painter = painterResource(
            id=R.drawable.umy1
        ),
            contentDescription = null,
            modifier=Modifier.padding(top=20.dp, bottom= 20.dp).size(250.dp)
        )
        Text(
            text ="Nama",
            style = TextStyle(fontSize = 20.sp)
        )
        Text(
            text="Dhimas Aditya Pratama",
            style = TextStyle(fontSize = 18.sp,color= Color.Red)
        )
        Text(
            text="20200140118",
            style=TextStyle(fontSize = 38.sp, fontWeight = FontWeight.Bold)
        )
        Image(
            painter = painterResource(id=R.drawable.foto),
            contentDescription = "Profile Image",
            modifier = Modifier
                .padding(top= 20.dp)
                .size(280.dp)
                .clip(RoundedCornerShape(43.dp))
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P2_BasicComposeTheme {
        BasicLayout()
    }
}