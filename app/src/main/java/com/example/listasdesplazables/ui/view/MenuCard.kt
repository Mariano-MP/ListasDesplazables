package com.example.listasdesplazables.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.listasdesplazables.model.Platillo

@Composable
fun MenuCard(
    platillo: Platillo,
    modifier: Modifier = Modifier
){
    Card(modifier.fillMaxWidth()
        .padding(10.dp)
    ){
        Column{
            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(10.dp),
                contentAlignment = Alignment.Center  // centra solo la imagen
            ) {
                Image(
                    painter = painterResource(platillo.imagenId),
                    contentDescription = stringResource(platillo.nombreId),
                    modifier = Modifier
                        .size(300.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }

            Text(
                text = LocalContext.current.getString(platillo.nombreId),
                modifier.padding(20.dp),
                    style = MaterialTheme.typography.headlineLarge
            )
            Text(
                text = "$ ${LocalContext.current.getString(platillo.precioId)}",
                modifier.padding(20.dp),
                style = MaterialTheme.typography.headlineMedium
            )

            val precioString = LocalContext.current.getString(platillo.precioId)
            val precio = precioString.toFloatOrNull() ?: 0f
            val precioConDescuento = precio - 20
            Text(
                text = "Oferta: $$precioConDescuento",
                modifier = Modifier.padding(20.dp),
                style = MaterialTheme.typography.headlineMedium,
                color = Color.Red
            )
        }
    }
}


