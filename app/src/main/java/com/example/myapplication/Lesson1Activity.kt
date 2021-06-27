package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants

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
                Color.White.copy(alpha = 0.7f)
            )
            .padding(20.dp)) {
            ImageView()
            MyListTextView()
            CardView1()
            CardView2()
        }
    }
    }
    @Composable
    fun CardView1(){
        Row(modifier = Modifier.padding(top = 15.dp)
            .clip(RoundedCornerShape(16.dp))
            .fillMaxWidth()
            .background(Color.White)
            .clickable {
                Toast
                    .makeText(this, "I Am Clicked", Toast.LENGTH_SHORT)
                    .show()
            }
            .padding(15.dp),verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.SpaceEvenly) {
            Surface(shape = CircleShape,border = BorderStroke(5.dp, Color.Magenta),modifier = Modifier.size(50.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    contentScale = ContentScale.Crop)
            }
            Column {
                Text(
                    text = "Admam Smith ",
                    color = Color.Black,
                    style = MaterialTheme.typography.h6
                )

                CompositionLocalProvider( LocalContentAlpha provides ContentAlpha.medium) {
                    Text(
                        text = "Last Seen 2 min Ago ",
                        style = MaterialTheme.typography.body2
                    )
                }
            }

        }
    }

    @Composable
    fun CardView2(){

            Row(modifier = Modifier.padding(top = 15.dp)
                .clip(RoundedCornerShape(16.dp))
                .fillMaxWidth()
                .background(Color.White)
                .padding(15.dp) .clickable {
                Toast
                    .makeText(this, "I Am Clicked", Toast.LENGTH_SHORT)
                    .show()
            }.background(color = MaterialTheme.colors.surface),verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.SpaceEvenly) {
                Surface(shape = CircleShape,border = BorderStroke(5.dp, Color.Magenta),modifier = Modifier.size(50.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = null,
                        contentScale = ContentScale.Crop)
                }
                Column {
                    Text(
                        text = "Admam Smith ",
                        color = Color.Black,
                        style = MaterialTheme.typography.h6
                    )

                    CompositionLocalProvider( LocalContentAlpha provides ContentAlpha.medium) {
                        Text(
                            text = "Last Seen 2 min Ago ",
                            style = MaterialTheme.typography.body2
                        )
                    }
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
    fun MyListTextView() {
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

