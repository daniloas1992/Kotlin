package com.example.bussinesscard

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.bussinesscard.ui.theme.BussinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainCard()
                }
            }
        }
    }
}

@Composable
fun MainCard(modifier: Modifier = Modifier) {

    Column(modifier = modifier) {
        ImageCard(modifier)
        MainText(modifier.align(alignment = Alignment.CenterHorizontally))
        MainContact(modifier)
    }
}

@Composable
fun ImageCard (modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)

    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Inside
    )
}

@Composable
fun MainText (modifier: Modifier = Modifier) {
    Text(
        text = "Full name",
        fontSize = 36.sp,
        modifier = modifier
    )
    Text(
        text = "Title",
        fontSize = 24.sp,
        modifier = modifier
    )
}

@Composable
fun MainContact(modifier: Modifier = Modifier) {
    Column (modifier = modifier) {
        Contact(modifier)
    }
}

@Composable
fun Contact(image: Image, contact: String, modifier: Modifier = Modifier) {
    Row (modifier = modifier) {
        Text(
            text = "+00 (00) 000-000"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainCardPreview() {
    BussinessCardTheme {
        MainCard()
    }
}