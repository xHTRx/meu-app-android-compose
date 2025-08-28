package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.uiprojeto.TelaHome
import com.example.myapplication.uiprojeto.TelaQr


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
              TelaHome()
                TelaQr()
            }
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun TelaHome() {
//    Scaffold(
//        modifier = Modifier.fillMaxSize()
//    ) { innerPadding ->
//        Column(
//            modifier = Modifier
//                .padding(innerPadding)
//                .fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.SpaceBetween
//        ) {
//            Cabecalho()
//            SecaoCentral()
//            Rodape()
//        }
//    }
//}
//
//
//@Composable
//fun Cabecalho() {
//    Card(
//        colors = CardDefaults.cardColors(containerColor = Color.Blue),
//        modifier = Modifier
//            .height(70.dp)
//            .fillMaxWidth(),
//        shape = RectangleShape
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.spacedBy(26.dp)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.iconecabecalho),
//                contentDescription = "Imagem de Perfil",
//                modifier = Modifier.size(50.dp)
//            )
//            Column {
//                Text(
//                    "Carteirinha",
//                    style = MaterialTheme.typography.headlineSmall,
//                    color = Color.White
//                )
//            }
//            Spacer(modifier = Modifier.width(80.dp))
//            Icon(
//                imageVector = Icons.Default.Face,
//                contentDescription = "Ícone de Perfil",
//                modifier = Modifier.size(50.dp),
//                tint = Color.White
//            )
//        }
//    }
//}
//
//
//
//
//
//
//@Composable
//fun SecaoCentral(modifier: Modifier = Modifier) {
//    Column(
//        modifier = modifier
//            .fillMaxWidth()
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.logoup),
//            contentDescription = "Logo da aplicação",
//            modifier = Modifier
//                .width(1700.dp)
//                .height(200.dp)
//        )
//
//
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceAround,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            //celular
//            CardSecao(
//                texto = "",
//                modifier = Modifier
//                    .weight(1f)
//                    .height(100.dp),
//                cor = Color(0xFFD80E0E),
//                // Substitua 'card1_icone' pelo nome real do seu arquivo de imagem em res/drawable
//                imagemResId = R.drawable.celularcard
//            )
//            Spacer(modifier = Modifier.width(12.dp))
//
//
//            //qrcode
//            CardSecao(
//                texto = "",
//                modifier = Modifier
//                    .weight(1f)
//                    .height(100.dp),
//                cor = Color(0xFF08259D),
//                // Substitua 'card2_icone' pelo nome real do seu arquivo de imagem em res/drawable
//                imagemResId = R.drawable.qrcode
//            )
//        }
//        Spacer(modifier = Modifier.height(9.dp))
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceAround,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//
//
//            //identidade
//            CardSecao(
//                texto = "",
//                modifier = Modifier
//                    .weight(1f)
//                    .height(100.dp),
//                cor = Color(0xFFEAB505),
//                imagemResId = R.drawable.identidade
//            )
//            Spacer(modifier = Modifier.width(12.dp))
//
//
//            //presente
//            CardSecao(
//                texto = "",
//                modifier = Modifier
//                    .weight(1f)
//                    .height(100.dp),
//                cor = Color(0xFF1D9E99),
//                imagemResId = R.drawable.presente // Exemplo de imagem para Card 4
//            )
//        }
//        Spacer(modifier = Modifier.height(16.dp))
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceAround,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            //pessoa
//            CardSecao(
//                texto = "",
//                modifier = Modifier
//                    .weight(1f)
//                    .height(100.dp),
//                cor = Color(0xFF7C33A8),
//                imagemResId = R.drawable.user // Exemplo de imagem para Card A
//            )
//
//
//            //camera
//            Spacer(modifier = Modifier.width(8.dp))
//            CardSecao(
//                texto = "",
//                modifier = Modifier
//                    .weight(1f)
//                    .height(100.dp),
//                cor = Color(0xFFFF4500),
//                imagemResId = R.drawable.camera // Exemplo de imagem para Card B
//            )
//            Spacer(modifier = Modifier.width(8.dp))
//
//
//            //sino
//            CardSecao(
//                texto = "",
//                modifier = Modifier
//                    .weight(1f)
//                    .height(100.dp),
//                cor = Color(0xFF16703C),
//                imagemResId = R.drawable.sino // Exemplo de imagem para Card C
//            )
//        }
//    }
//}
//
//
//
//
//@Composable
//fun Rodape() {
//    Card(
//        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
//        modifier = Modifier
//            .height(100.dp)
//            .fillMaxWidth(),
//        shape = RectangleShape
//    ) {
//        Box(
//            modifier = Modifier.fillMaxSize(),
//            contentAlignment = Alignment.Center
//        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.spacedBy(3.dp)
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.casalogo),
//                    contentDescription = "Ícone de celular",
//                    modifier = Modifier.size(100.dp)
//                )
//                Image(
//                    painter = painterResource(id = R.drawable.celularicone),
//                    contentDescription = "Ícone de QR Code",
//                    modifier = Modifier.size(100.dp)
//                )
//                Image(
//                    painter = painterResource(id = R.drawable.ofertasicone),
//                    contentDescription = "Ícone de presente",
//                    modifier = Modifier.size(110.dp)
//                )
//                Image(
//                    painter = painterResource(id = R.drawable.qrcodeicone),
//                    contentDescription = "Ícone de QR Code",
//                    modifier = Modifier.size(80.dp)
//                )
//            }
//        }
//    }
//}
//
//
//
//
//@Composable
//fun CardSecao(
//    texto: String,
//    modifier: Modifier = Modifier,
//    cor: Color = MaterialTheme.colorScheme.surfaceVariant,
//    @DrawableRes imagemResId: Int
//) {
//    Card(
//        modifier = modifier,
//        colors = CardDefaults.cardColors(containerColor = cor),
//        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
//        shape = RoundedCornerShape(4.dp)
//    ) {
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//            Image(
//                painter = painterResource(id = imagemResId),
//                contentDescription = null,
//                modifier = Modifier.size(60.dp) // Altere o tamanho aqui se quiser
//            )
//            // Este código abaixo garante que o texto e o espaço só apareçam se a string não for vazia
//            if (texto.isNotEmpty()) {
//                Spacer(modifier = Modifier.height(8.dp))
//                Text(text = texto)
//            }
//        }
//    }
//}

