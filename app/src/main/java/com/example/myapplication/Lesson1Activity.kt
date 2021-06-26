package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class Lesson1Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MainActivityCompose()

        }
    }

@Composable
    fun MainActivityCompose(){
    MaterialTheme {
        Column(modifier = Modifier
            .background(Color.Black)
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(10.dp)
            .clip(
                RoundedCornerShape(25.dp)
            )
            .background(
                Color.Yellow
            )
            .padding(20.dp)) {
            ImageView()
            MtList()
        }
    }
    }
    @Composable
    fun ImageView() {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .clip(
                    RoundedCornerShape(15.dp)
                )
                .height(155.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop,
        )
    }

    @Composable
    fun MtList() {
        Text(
            text = "This is a  very long long long heading for you to check the functionality of the beautiful jetpack compose ",
            color = Color.Red,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.h3
        )
        Text(
            text = "This is a gibberish no 1 cgfgfg ",
            color = Color.Cyan,
            style = MaterialTheme.typography.subtitle1
        )

        Text(
            text = "This is a gibberish no 1 cgfgfg ",
            color = Color.Green,
            style = MaterialTheme.typography.body1
        )
    }


    @Preview(showBackground = true)
    @Composable
    fun Greet() {
       MainActivityCompose()
    }
}

