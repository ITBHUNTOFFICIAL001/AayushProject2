package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                Modifier
                    .fillMaxSize()
                    .background(Color.Transparent)
                , verticalArrangement =Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally ) {
                Image(modifier = Modifier
                    .height(400.dp)
                    .width(400.dp),
                    painter = painterResource(
                        id = R.drawable.app_development_project_image_),
                    contentDescription = "Logo Image"
                )
                Spacer(modifier= Modifier.height(24.dp))



                TextField(value = "", onValueChange = {}, colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White
                ),
                    label={ Text(text = "Enter your mobile number")})
                Spacer(modifier= Modifier.height(20.dp))
                Button(modifier = Modifier.width(100.dp), onClick = { /*TODO*/ }
                , border = BorderStroke(5.dp,Color.Blue)
                , shape = RoundedCornerShape(20.dp)
                , colors = ButtonDefaults.buttonColors(Color.Blue)) {
                    Text(text = stringResource(id = R.string.Next))
                }
                Spacer(modifier= Modifier.height(20.dp))


                Row {
                    Text(text = stringResource(id = R.string.new_account), fontSize = 20.sp)



                    Button( onClick = { /*TODO*/ }
                    , border = BorderStroke(1.dp,Color.White), modifier = Modifier
                            .height(40.dp)
                            .width(100.dp)
                        , shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(Color(0x00FFFFFF)))
                    {
                        Text( text = stringResource(id = R.string.signup), fontSize = 15.sp,
                            color = Color.Magenta)
                        
                    }


                }
                Spacer(modifier= Modifier.height(20.dp))
                LinearProgressIndicator(progress = 0.25f, color = Color.Blue)
            }




        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}