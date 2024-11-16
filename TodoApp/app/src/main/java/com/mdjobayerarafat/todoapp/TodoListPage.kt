package com.mdjobayerarafat.todoapp

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun TodoListPage(){
    val todoList = getFakeTodo()
    Text(text = todoList.toString())


}