package com.example.a19200211_20200077_articulocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a19200211_20200077_articulocompose.ui.theme._19200211_20200077_ArticuloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _19200211_20200077_ArticuloComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AplicacionComposeArticulo()
                }
            }
        }
    }
}

@Composable
fun AplicacionComposeArticulo() {
    ArticleCard(
        titulo = stringResource(R.string.titulo_jetpack_compose),// R.string.titulo_jetpack_compose
        descripcionCorta = stringResource(R.string.compose_corta_descripcion),// R.string.compose_corta_desc
        descripcionLarga = stringResource(R.string.compose_larga_descripcion),// R.string.compose_larga_desc
        imagePainter = painterResource(R.drawable.bg_compose_background)
    )
}

@Composable
private fun ArticleCard(
    titulo: String,
    descripcionCorta: String,
    descripcionLarga: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Image(painter = imagePainter, contentDescription = null)
        Text(
            text = titulo,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = descripcionCorta,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = descripcionLarga,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AplicacionComposeArticuloPreview() {
    _19200211_20200077_ArticuloComposeTheme {
        AplicacionComposeArticulo()
    }
}