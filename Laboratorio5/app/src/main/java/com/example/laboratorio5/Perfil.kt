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
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.ui.draw.alpha

class Perfil: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Principal()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyProfilePreview() {
    Laboratorio5Theme {
        Principal()
    }
}

@Composable
fun Principal(){
    Surface {
        Column (modifier = Modifier.verticalScroll(rememberScrollState()))
        {
            Profile()
        }
    }
}

@Composable
fun Profile(){
    val gray = Color(0xFF808080)
    val black = Color.Black
    val red = Color.Red
    val configur = painterResource(id = R.drawable.baseline_settings_24)
    val avatar = painterResource(id = R.drawable.baseline_account_circle_24)
    val bgprofile = painterResource(id = R.drawable.libros_fondo)
    val campus = painterResource(id = R.drawable.baseline_home_work_24)
    val friends = painterResource(id = R.drawable.baseline_group_24)
    val calendar = painterResource(id = R.drawable.baseline_calendar_today_24)
    val courses = painterResource(id = R.drawable.baseline_menu_book_24)
    val schedule = painterResource(id = R.drawable.baseline_class_24)
    val mygroups = painterResource(id = R.drawable.baseline_groups_24)
    val events = painterResource(id = R.drawable.baseline_edit_calendar_24)


    Column(horizontalAlignment = Alignment.CenterHorizontally)
    {
        Row (horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(15.dp))
        {
            Text(text = "Mi Perfil",
                style = TextStyle(color = black,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(start = 130.dp))
            Image(painter = configur,
                contentDescription = "Settings",
                modifier = Modifier
                    .size(25.dp)
                    .absoluteOffset(0.dp, 0.dp))
        }
        Box (Modifier
            .fillMaxWidth()
            .height(200.dp))
        {
            Image(painter = bgprofile,
                contentDescription = "Background",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(200.dp)
                    .alpha(0.6f))
            Image(painter = avatar,
                contentDescription = "Profile Avatar",
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.Center)
                    .absoluteOffset(0.dp, 40.dp))
        }
        Text(text = "Gabriel Estuardo García Donis",
            style = TextStyle(color = black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(20.dp))
    }
    Column (Modifier.fillMaxWidth())
    {
        Divider(color = gray, thickness = 1.dp)
        Row {
            Image(painter = campus,
                contentDescription = "Campus",
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(5.dp, 15.dp))
            Column {
                Text(text = "My Campus",
                    style = TextStyle(color = black,
                        fontSize = 20.sp),
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(top = 10.dp))
                Text(text = "Campus Central",
                    style = TextStyle(color = black,
                        fontSize = 15.sp),
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(bottom = 10.dp))
            }
        }
        Divider(color = gray, thickness = 1.dp)
        Row {
            Image(painter = friends,
                contentDescription = "Amigos",
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(5.dp, 15.dp) )
            Text(text = "My Friends",
                style = TextStyle(color = black,
                    fontSize = 20.sp),
                modifier = Modifier.padding(20.dp))
        }
        Divider(color = gray, thickness = 1.dp)
        Row {
            Image(painter = calendar,
                contentDescription = "Calendario",
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(5.dp, 15.dp))
            Text(text = "My Calendar",
                style = TextStyle(color = black,
                    fontSize = 20.sp),
                modifier = Modifier.padding(20.dp))
        }
        Divider(color = gray, thickness = 1.dp)
        Row {
            Image(painter = courses,
                contentDescription = "Cursos",
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(5.dp, 15.dp))
            Text(text = "My Courses",
                style = TextStyle(color = black,
                    fontSize = 20.sp),
                modifier = Modifier.padding(20.dp))
        }
        Divider(color = gray, thickness = 1.dp)
        Row {
            Image(painter = schedule,
                contentDescription = "Notas",
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(5.dp, 15.dp))
            Text(text = "My Grades",
                style = TextStyle(color = black,
                    fontSize = 20.sp),
                modifier = Modifier.padding(20.dp))
        }
        Divider(color = gray, thickness = 1.dp)
        Row {
            Image(painter = mygroups,
                contentDescription = "Grupos",
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(5.dp, 15.dp))
            Text(text = "My Groups",
                style = TextStyle(color = black,
                    fontSize = 20.sp),
                modifier = Modifier.padding(20.dp))
        }
        Divider(color = gray, thickness = 1.dp)
        Row {
            Image(painter = events,
                contentDescription = "Eventos",
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(5.dp, 15.dp))

            Text(text = "My Upcoming Events",
                style = TextStyle(color = black,
                    fontSize = 20.sp),
                modifier = Modifier.padding(20.dp))
        }
        Divider(color = gray, thickness = 1.dp)
    }
}