package com.example.jetpacks

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      val fontFamily = FontFamily(
        Font(R.font.lexend_thin, FontWeight.Thin),
        Font(R.font.lexend_black, FontWeight.Black),
        Font(R.font.lexend_bold, FontWeight.Bold),
        Font(R.font.lexend_extrabold, FontWeight.ExtraBold),
        Font(R.font.lexend_extralight, FontWeight.ExtraLight),
        Font(R.font.lexend_light, FontWeight.Light),
        Font(R.font.lexend_medium, FontWeight.Medium),
        Font(R.font.lexend_regular, FontWeight.Normal),
        Font(R.font.lexend_semibold, FontWeight.SemiBold),
      )
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
//      val painter = painterResource(id = R.drawable.download)
//      val description = "Just simple text at the bottom"
//      val title = "description"
//      Box(
//        modifier = Modifier
//          .fillMaxWidth(0.5f)
//          .padding(16.dp)
//      ) {
//        ImageCard(painter = painter, contentDescription = description, title = title)
//      }

      CustomText(fontFamily = fontFamily, context = this@MainActivity)

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

@Composable
fun CustomText(
  fontFamily: FontFamily,
  context: Context,
  modifier: Modifier = Modifier
) {
  Box(
    modifier = modifier
      .fillMaxSize()
      .background(Color(0xFF101010))
  ) {
    Text(
      modifier = modifier
        .align(alignment = Alignment.Center)
        .clickable {
          Toast
            .makeText(context, "clicked!", Toast.LENGTH_SHORT)
            .show()
        },
      text = buildAnnotatedString {
        withStyle(
          style = SpanStyle(
            color = Color.Red,
            fontSize = 50.sp
          )
        ) {
          append("J")
        }
        append("etpack ")
        withStyle(
          style = SpanStyle(
            color = Color.Blue,
            fontSize = 50.sp
          )
        ) {
          append("C")
        }
        append("ompose")
      },
      color = Color.White,
      fontSize = 30.sp,
      fontFamily = fontFamily,
      fontWeight = FontWeight.Bold,
      fontStyle = FontStyle.Italic,
      textDecoration = TextDecoration.Underline
    )
  }
}