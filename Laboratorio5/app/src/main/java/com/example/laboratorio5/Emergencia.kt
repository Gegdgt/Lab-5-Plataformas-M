package com.example.laboratorio5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.laboratorio5.ui.theme.Laboratorio5Theme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip

class Emergencia : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Emergency()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun EmergencyPreview() {
    Laboratorio5Theme {
        Emergency()
    }
}

@Composable
fun Emergency()
{
    Surface {
        val gray = Color(0xFF808080)
        val black = Color.Black
        val white = Color.White
        val green = Color(68, 156, 8)
        val cerrar = painterResource(id = R.drawable.baseline_close_24)
        val warning = painterResource(id = R.drawable.baseline_warning_24)
        val phone = painterResource(id = R.drawable.baseline_local_phone_24)
        val clinica = painterResource(id = R.drawable.clinica_uvg)

        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth())
        {
            Row(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth().padding(15.dp))
            {
                Image(
                    painter = cerrar,
                    contentDescription = "Exit",
                    modifier = Modifier
                        .absoluteOffset(0.dp, 0.dp)
                        .size(25.dp)
                )
                Text(
                    text = "Emergency Contacts",
                    style = TextStyle(
                        color = black,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(end = 65.dp))
            }
            Divider(color = gray, thickness = 1.dp)
            Row {
                Image(painter = warning,
                    contentDescription = "Emergencia",
                    modifier = Modifier
                        .size(40.dp)
                        .absoluteOffset(5.dp, 15.dp))

                Column {
                    Text(text = "Emergencias",
                        style = TextStyle(color = black, fontSize = 20.sp, FontWeight.Bold),
                        modifier = Modifier
                            .padding(horizontal = 20.dp)
                            .padding(top = 10.dp))

                    Text(text = "Si se presenta un incidente o un percance " +
                            "por favor marca el número de emergencia y rápidamente te apoyaremos",
                        style = TextStyle(color = black, fontSize = 15.sp),
                        modifier = Modifier
                            .padding(horizontal = 20.dp)
                            .padding(bottom = 10.dp))
                }
            }
            //Cuadro verde
            Box (modifier = Modifier
                .width(350.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(green))
            {
                Image(painter = phone, contentDescription = "Phone",
                    modifier = Modifier
                        .size(35.dp)
                        .absoluteOffset(5.dp,5.dp))

                Text(text = "Call 5978-1736",
                    style = TextStyle(color = white,
                            fontSize = 16.sp,
                            FontWeight.Bold),
                    modifier = Modifier
                        .padding(horizontal = 50.dp)
                        .padding(vertical = 10.dp))
            }
            Divider(color = white, thickness = 10.dp)
            Divider(color = gray, thickness = 1.dp)
            Row {
                Image(painter = clinica,
                    contentDescription = "Clinica",
                    modifier = Modifier
                        .size(40.dp)
                        .absoluteOffset(5.dp, 15.dp))
                Column {
                    Text(text = "Clínica UVG",
                        style = TextStyle(color = black, fontSize = 20.sp, FontWeight.Bold),
                        modifier = Modifier
                            .padding(horizontal = 20.dp)
                            .padding(top = 10.dp))

                    Text(text = "La Clínica UVG, presta los siguientes servicios: " +
                            "\n" +
                            "\n○ Atención a Emergencias " +
                            "\n○ Atención Primaria a Enfermedades Comunes " +
                            "\n○ Atención Primaria a Enfermedades Comunes " +
                            "\n○ Plan Educacional sobre Enfermedades " +
                            "\n" +
                            "\n Horario de Atención: 7:00a.m. a 8:30a.m. " +
                            "\n Campus Central Edificio F119-120",
                        style = TextStyle(color = black, fontSize = 15.sp),
                        modifier = Modifier
                            .padding(horizontal = 20.dp)
                            .padding(bottom = 10.dp))
                }
            }
            //Cuadro verde
            Box (modifier = Modifier
                .width(350.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(green))
            {
                Image(painter = phone,
                    contentDescription = "Call logo",
                    modifier = Modifier
                        .size(35.dp)
                        .absoluteOffset(5.dp,5.dp))

                Text(text = "Call 2507-1500 ex 21312",
                    style = TextStyle(color = white, fontSize = 16.sp, FontWeight.Bold),
                    modifier = Modifier
                        .padding(horizontal = 50.dp)
                        .padding(vertical = 10.dp))
            }
            Divider(color = white, thickness = 10.dp)
            Divider(color = gray, thickness = 1.dp)
            Divider(color = white, thickness = 300.dp)
        }
    }
}