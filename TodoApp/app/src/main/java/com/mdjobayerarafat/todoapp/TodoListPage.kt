package com.mdjobayerarafat.todoapp

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.util.Locale

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun TodoListPage(){
    val todoList = getFakeTodo()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        LazyColumn(
            content = {
                itemsIndexed(todoList){index:Int, item: Todo ->
                    TodoIteam(item = item)
                }
            }
        )
    }


}

@Composable
fun TodoIteam(item: Todo){
   Row(
       modifier = Modifier.fillMaxSize()
           .padding(8.dp)
           .clip(RoundedCornerShape(32.dp))
           .background(MaterialTheme.colorScheme.primary)
           .padding(16.dp)
   ) {

       Column {
           Text(text = SimpleDateFormat("HH:mm:aa, dd/mm", Locale.ENGLISH).format(item.createdAt),
           fontSize = 10.sp,
               color = Color.LightGray
           )
           Text(text = item.title,
               fontSize = 20.sp,
               color = Color.White
               )
       }
   }
}