package com.example.jetpacks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
//      Row(
//        modifier = Modifier
//          .width(300.dp)
//          .fillMaxHeight(0.7f)
//          .background(Color.Green),
//        horizontalArrangement = Arrangement.SpaceAround,
//        verticalAlignment = Alignment.CenterVertically
//      ) {
//        Text("Hello")
//        Text(text = "new")
//        Text(text = "compose")
//      }

//      Column(
//        modifier = Modifier
//          .background(Color.Green)
//          .fillMaxHeight(0.5f)
//          .fillMaxWidth()
//          .border(5.dp, Color.Magenta)
//          .padding(5.dp)
//          .border(5.dp, Color.Yellow)
//          .padding(5.dp)
//          .border(10.dp, Color.Red)
//          .padding(5.dp)
//      ) {
//        Text(
//          text = "Hello", modifier = Modifier
//            .border(5.dp, Color.Yellow)
//            .padding(5.dp)
//            .offset(20.dp, 20.dp)
//            .border(10.dp, Color.Blue)
//            .padding(10.dp)
//        )
//        Spacer(
//          modifier = Modifier
//            .height(50.dp)
//        )
//        Text(text = "World", modifier = Modifier.clickable {
//          Toast.makeText(this@MainActivity, "clicked!", Toast.LENGTH_SHORT).show()
//        })
//      }
      val painter = painterResource(id = R.drawable.download)
      val description = "Just simple text at the bottom"
      val title = "description"
      Box(
        modifier = Modifier
          .fillMaxWidth(0.5f)
          .padding(16.dp)
      ) {
        ImageCard(painter = painter, contentDescription = description, title = title)
      }

    }
  }
}

@Composable
fun ImageCard(
  painter: Painter,
  contentDescription: String,
  title: String,
  modifier: Modifier = Modifier
) {
  Card(
    modifier = modifier.fillMaxWidth(),
    shape = RoundedCornerShape(15.dp),
    elevation = 5.dp
  ) {
    Box(modifier = modifier.height(200.dp)) {
      Image(
        modifier = modifier.fillMaxSize(),
        painter = painter,
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop
      )
      Box(
        modifier = modifier
          .fillMaxSize()
          .background(
            Brush.verticalGradient(colors = listOf(Color.Transparent, Color.Black), startY = 400f)
          )
      )

      Text(
        text = title,
        modifier = modifier
          .align(Alignment.BottomStart)
          .padding(12.dp),
        color = Color.White,
        fontSize = 16.sp
      )
    }
  }
}