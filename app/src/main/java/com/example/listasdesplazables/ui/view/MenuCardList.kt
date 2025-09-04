package com.example.listasdesplazables.ui.view

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.listasdesplazables.model.Platillo

@Composable
fun MenuCardList(
    platilloList:List<Platillo>,
    modifier: Modifier = Modifier
){
    LazyColumn(modifier) {
        items(platilloList){
            platillo -> MenuCard(
                platillo = platillo,
                modifier.padding(1.dp)
            )
        }
    }
}