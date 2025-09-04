package com.example.tarjetadepresentacion

import android.R.attr.background
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetadepresentacion.ui.theme.TarjetaDePresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaDePresentacionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFA0EACF)
                ) {
                    PresentCardApp()
                }
            }
        }
    }
}

@Composable
fun PresentCardApp() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFA0EACF))
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val image = painterResource(R.drawable.android_logo)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
                    .background(Color(0xFF001F3F))
            )
            Text(
                text = stringResource(R.string.full_name),
                fontSize=50.sp,
                modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
                textAlign = TextAlign.Justify
            )
            Text(
                text = stringResource(R.string.title),
                color = Color(0xFF014B22),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Justify
            )

        }
        Spacer(modifier = Modifier.height(100.dp))
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 32.dp),
            //horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                val image = painterResource(R.drawable.call_24dp_e3e3e3)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp),
                    colorFilter = ColorFilter.tint(Color(0xFF014B22))
                )
                Text(
                    text = stringResource(R.string.number),
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                    textAlign = TextAlign.Justify
                )

            }
            Row {
                val image = painterResource(R.drawable.share_24dp_e3e3e3)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp),
                    colorFilter = ColorFilter.tint(Color(0xFF014B22))
                )
                Text(
                    text = stringResource(R.string.socialmedia),
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                    textAlign = TextAlign.Justify
                )
            }
            Row{
                val image = painterResource(R.drawable.mail_24dp_e3e3e3)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp),
                    colorFilter = ColorFilter.tint(Color(0xFF014B22))
                )
                Text(
                    text = stringResource(R.string.email),
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                    textAlign = TextAlign.Justify
                )
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaDePresentacionTheme {
        PresentCardApp()
    }
}