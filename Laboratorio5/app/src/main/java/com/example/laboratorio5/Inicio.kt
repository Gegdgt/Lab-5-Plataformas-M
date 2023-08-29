package com.example.laboratorio5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.laboratorio5.ui.theme.Laboratorio5Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.draw.clip

class Inicio : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PrincipalPage()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PrincipalPagePreview() {
    Laboratorio5Theme {
        PrincipalPage()
    }
}

@Composable
fun PrincipalPage() {
    Surface {
        Column {
            Front()
            Destacados()
            Servicios()
        }
    }
}

@Composable
fun Front(){
    val black = Color.Black
    val principalimage = painterResource(id = R.drawable.campus_central)
    Column(horizontalAlignment = Alignment.CenterHorizontally)
    {
        Row ()
        {
            Text(text = "Campus Central",
                style = TextStyle(color = black, fontSize = 26.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(20.dp))
        }
        Image(painter = principalimage,
            contentDescription = "PrincipalImage",
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(200.dp))
    }
}
@Composable
fun Destacados(){
    val gray = Color(0xFF808080)
    Text(text = "Destacados",
        style = TextStyle(color = gray, fontSize = 25.sp, fontWeight = FontWeight.Bold),
        modifier = Modifier.padding(20.dp))

    Row (modifier = Modifier
        .fillMaxWidth()
        .size(180.dp),
        horizontalArrangement = Arrangement.SpaceBetween)
    {
        PageUp(modifier = Modifier.weight(1f))
    }
}

@Composable
fun PageUp(modifier: Modifier = Modifier){
    val white = Color.White
    val darkgray = Color.DarkGray
    val green = Color(68, 156, 8)
    val sn = painterResource(id = R.drawable.service_now)
    val actualidad = painterResource(id = R.drawable.actualidad_uvg)
    //SN
    Column (modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter = sn,
            contentDescription = "Service Now Image",
            modifier = Modifier.size(100.dp))

        Box(modifier = Modifier
            .width(180.dp)
            .clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
            .background(green))
        {
            Text(text = "Service Now",
                style = TextStyle(color = white, fontSize = 15.sp),
                modifier = Modifier.padding(12.dp))
        }
    }
    //Actualidad UVG
    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter = actualidad,
            contentDescription = "Actualidad",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(180.dp)
                .height(100.dp)
                .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)))

        Box(modifier = Modifier
            .width(180.dp)
            .clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
            .background(color = darkgray))
        {
            Text(text = "Actualidad UVG",
                style = TextStyle(color = white, fontSize = 15.sp),
                modifier = Modifier.padding(12.dp))
        }
    }
}


@Composable
fun Servicios() {
    val gray = Color(0xFF808080)
    Text(text = "Servicios y Recursos",
        style = TextStyle(color = gray, fontSize = 24.sp, fontWeight = FontWeight.Bold),
        modifier = Modifier.padding(20.dp))

    Row (modifier = Modifier
        .fillMaxWidth()
        .size(180.dp),
        horizontalArrangement = Arrangement.SpaceBetween)
    {
        PageDown(modifier = Modifier.weight(1f))
    }
}

@Composable
fun PageDown(modifier: Modifier = Modifier) {
    val white = Color.White
    val darkgray = Color.DarkGray
    val green = Color(68, 156, 8)
    val directorio = painterResource(id = R.drawable.directorio_de_servicios_estudiantiles)
    val portal = painterResource(id = R.drawable.portal_web_bibliotecas_uvg)

    // Directorio de Servicios Estudiantiles
    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(
            painter = directorio,
            contentDescription = "Directorio de servicios",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(180.dp)
                .height(100.dp)
                .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp))
        )
        Box(
            modifier = Modifier
                .width(180.dp)
                .clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
                .background(green)
                .padding(10.dp)
        )
        {
            Text(
                text = "Directorio de Servicios Estudiantiles",
                style = TextStyle(color = white, fontSize = 12.sp)
            )
        }
    }
    //Portal Web Bibliotecas UVG
    Column (modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter = portal,
            contentDescription = "Portal Biblioteca",
            modifier = Modifier.height(100.dp))

        Box(modifier = Modifier
            .width(180.dp)
            .clip(RoundedCornerShape(bottomStart = 8.dp, bottomEnd = 8.dp))
            .background(color = darkgray)
            .padding(10.dp))
        {
            Text(text = "Portal Web Bibliotecas UVG",
                style = TextStyle(color = white, fontSize = 12.sp))
        }
    }
}