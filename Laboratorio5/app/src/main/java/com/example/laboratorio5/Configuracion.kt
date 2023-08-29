package com.example.laboratorio5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.laboratorio5.ui.theme.Laboratorio5Theme

class Configuracion : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5Theme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Config()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SettingsPreview() {
    Laboratorio5Theme {
        Config()
    }
}

@Composable
fun Config() {
    val lightGray = Color(0xFFD3D3D3)
    val gray = Color(0xFF808080)
    val black = Color.Black
    val red = Color.Red
    val cerrar = painterResource(id = R.drawable.baseline_close_24)
    val perfil = painterResource(id = R.drawable.baseline_manage_accounts_24)
    val correo = painterResource(id = R.drawable.baseline_email_24)
    val notificaciones = painterResource(id = R.drawable.baseline_notifications_24)
    val privacidad = painterResource(id = R.drawable.baseline_privacy_tip_24)
    val help = painterResource(id = R.drawable.baseline_help_24)
    val about = painterResource(id = R.drawable.baseline_info_24)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(15.dp)
        ) {
            Image(
                painter = cerrar,
                contentDescription = "Exit",
                modifier = Modifier
                    .absoluteOffset(0.dp, 0.dp)
                    .size(25.dp)
            )
            Text(
                text = "Settings",
                style = TextStyle(
                    color = black,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(end = 140.dp))
        }
        Divider(color = lightGray, thickness = 20.dp)
        Column(horizontalAlignment = Alignment.Start)

        {
            Divider(color = gray, thickness = 1.dp)

            Row {
                Image(
                    painter = perfil,
                    contentDescription = "Edit profile",
                    modifier = Modifier
                        .size(35.dp)
                        .absoluteOffset(7.dp, 15.dp)
                )
                Text(
                    text = "Edit Profile",
                    style = TextStyle(color = black, fontSize = 20.sp),
                    modifier = Modifier.padding(20.dp)
                )
            }
            Divider(color = gray, thickness = 1.dp)
            Row {
                Image(
                    painter = correo,
                    contentDescription = "Email",
                    modifier = Modifier
                        .size(40.dp)
                        .absoluteOffset(5.dp, 15.dp)
                )
                Text(
                    text = "Email Addresses",
                    style = TextStyle(color = black, fontSize = 20.sp),
                    modifier = Modifier.padding(20.dp)
                )
            }
            Divider(color = gray, thickness = 1.dp)
            Row {
                Image(
                    painter = notificaciones,
                    contentDescription = "Notificaciones",
                    modifier = Modifier
                        .size(40.dp)
                        .absoluteOffset(5.dp, 15.dp)
                )
                Text(
                    text = "Notifications",
                    style = TextStyle(color = black, fontSize = 20.sp),
                    modifier = Modifier.padding(20.dp)
                )
            }
            Divider(color = gray, thickness = 1.dp)
            Row {
                Image(
                    painter = privacidad,
                    contentDescription = "Privacidad",
                    modifier = Modifier
                        .size(40.dp)
                        .absoluteOffset(5.dp, 15.dp)
                )
                Text(
                    text = "Privacy",
                    style = TextStyle(color = black, fontSize = 20.sp),
                    modifier = Modifier.padding(20.dp)
                )
            }
            Divider(color = lightGray, thickness = 20.dp)
            Row {
                Image(
                    painter = help,
                    contentDescription = "Help",
                    modifier = Modifier
                        .size(40.dp)
                        .absoluteOffset(5.dp, 15.dp)
                )
                Column {
                    Text(
                        text = "Help & Feedback",
                        style = TextStyle(color = black, fontSize = 20.sp),
                        modifier = Modifier
                            .padding(horizontal = 20.dp)
                            .padding(top = 10.dp)
                    )
                    Text(
                        text = "Troubleshooting tips and guides",
                        style = TextStyle(color = black, fontSize = 15.sp),
                        modifier = Modifier
                            .padding(horizontal = 20.dp)
                            .padding(bottom = 10.dp)
                    )
                }
            }
            Divider(color = gray, thickness = 1.dp)
            Row {
                Image(
                    painter = about,
                    contentDescription = "About",
                    modifier = Modifier
                        .size(40.dp)
                        .absoluteOffset(5.dp, 15.dp)
                )
                Column {
                    Text(
                        text = "About",
                        style = TextStyle(color = black, fontSize = 20.sp),
                        modifier = Modifier
                            .padding(horizontal = 20.dp)
                            .padding(top = 10.dp)
                    )
                    Text(
                        text = "App Information and documents",
                        style = TextStyle(color = black, fontSize = 15.sp),
                        modifier = Modifier
                            .padding(horizontal = 20.dp)
                            .padding(bottom = 10.dp)
                    )
                }
            }
            Divider(color = lightGray, thickness = 20.dp)

            Text(
                text = "Logout",
                style = TextStyle(color = red,
                    fontSize = 20.sp,
                    FontWeight.Bold),
                modifier = Modifier
                    .absoluteOffset(0.dp, 15.dp)
                    .padding(start = 160.dp)
                    .height(60.dp),
                textAlign = TextAlign.Center
            )
            Divider(color = lightGray, thickness = 300.dp)
        }
    }
}
