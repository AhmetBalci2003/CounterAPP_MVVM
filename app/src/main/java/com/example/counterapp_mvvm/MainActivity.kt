package com.example.counterapp_mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.counterapp_mvvm.ui.theme.CounterAPP_MVVMTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewmodel:CounterViewModel = CounterViewModel()



            CounterAPP_MVVMTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color=MaterialTheme.colorScheme.background) {

                }
                CounterApp(viewModel = viewmodel)

                }
            }
        }


}

@Composable
fun CounterApp(viewModel: CounterViewModel)
{
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
      Text(text = "Count:${viewModel.count.value}",
          fontWeight = FontWeight.Bold,
          fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
       Row() {
           Button(onClick = { viewModel.increment()}) {
               Text(text = "increment")
               
           }
           Button(onClick = { viewModel.decrement()}) {
               Text(text = "decrement")

           }

           
       }
        
        
        

    }


}

