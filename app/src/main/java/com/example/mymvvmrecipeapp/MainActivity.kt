package com.example.mymvvmrecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mymvvmrecipeapp.ui.theme.MyMVVMRecipeAppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MyMVVMRecipeAppTheme {
        Column(Modifier.padding(16.dp)){
          Text(text = "Hi")
          Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))
          Text(text = "First Android App with JetPack Compose")
          Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))
          Button(onClick = {}, Modifier.size(128.dp)) {
            Text(text = "Button")
          }
        }
      }
    }
  }
}
