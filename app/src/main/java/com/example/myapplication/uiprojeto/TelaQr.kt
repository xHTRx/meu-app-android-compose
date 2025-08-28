package com.example.myapplication.uiprojeto


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import com.example.myapplication.R


//class TelaQr : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            MyApplicationTheme {
//                Telaqr()
//            }
//        }
//    }
//}


@Preview(showBackground = true)
@Composable
fun TelaQr() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Cabecalho()
            SecaoCentral(modifier = Modifier.weight(1f))
            Rodape()
        }
    }
}


@Composable
fun Cabecalho() {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.Blue),
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth(),
        shape = RectangleShape
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(26.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconecabecalho),
                contentDescription = "Imagem de Perfil",
                modifier = Modifier.size(50.dp)
            )


            Spacer(modifier = Modifier.width(60.dp))


            Column {
                Text(
                    "QR Code",
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.White
                )
            }


        }
    }
}


@Composable
fun SecaoCentral(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Escanei o QR Code!!",
            style = MaterialTheme.typography.headlineLarge,
        )
        Spacer(modifier = Modifier.height(40.dp))
        Box(
            modifier = Modifier
                .size(350.dp)
                .border(BorderStroke(8.dp, Color.Red), RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.myqrcode),
                contentDescription = "Logo da aplicação",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(8.dp))
            )
        }
//        Spacer(modifier = Modifier.height(140.dp))
//        Box(
//            modifier = Modifier
//                .width(350.dp)
//                .height(100.dp)
//                .border(BorderStroke(8.dp, Color.Red), RoundedCornerShape(8.dp)),
//            contentAlignment = Alignment.Center
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.myqrcode),
//                contentDescription = "Logo da aplicação",
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clip(RoundedCornerShape(8.dp))
//            )
//        }
    }
}


@Composable
fun Rodape() {
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth(),
        shape = RectangleShape
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(3.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.casalogo),
                    contentDescription = "Ícone de celular",
                    modifier = Modifier.size(100.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.celularicone),
                    contentDescription = "Ícone de QR Code",
                    modifier = Modifier.size(100.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.ofertasicone),
                    contentDescription = "Ícone de presente",
                    modifier = Modifier.size(110.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.qrcodeicone),
                    contentDescription = "Ícone de QR Code",
                    modifier = Modifier.size(80.dp)
                )
            }
        }
    }
}





