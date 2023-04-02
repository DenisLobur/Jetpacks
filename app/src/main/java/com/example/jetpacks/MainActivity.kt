package com.example.jetpacks

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

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
      Column(
        modifier = Modifier
          .background(Color.Green)
          .fillMaxHeight(0.5f)
          .fillMaxWidth()
          .border(5.dp, Color.Magenta)
          .padding(5.dp)
          .border(5.dp, Color.Yellow)
          .padding(5.dp)
          .border(10.dp, Color.Red)
          .padding(5.dp)
      ) {
        Text(
          text = "Hello", modifier = Modifier
            .border(5.dp, Color.Yellow)
            .padding(5.dp)
            .offset(20.dp, 20.dp)
            .border(10.dp, Color.Blue)
            .padding(10.dp)
        )
        Spacer(
          modifier = Modifier
            .height(50.dp)
        )
        Text(text = "World", modifier = Modifier.clickable {
          Toast.makeText(this@MainActivity, "clicked!", Toast.LENGTH_SHORT).show()
        })
      }
    }
  }
}