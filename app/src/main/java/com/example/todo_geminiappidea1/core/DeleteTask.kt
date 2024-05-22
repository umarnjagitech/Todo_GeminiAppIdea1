package com.example.todo_geminiappidea1.core

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import com.example.todo_geminiappidea1.data.Task

@Composable
fun DeleteTask(
    task: Task,
    onDeleteTask: (Task) -> Unit
){
    IconButton(
        onClick = {
            onDeleteTask(task)
        }
    ) {
        Icon(
            imageVector = Icons.Filled.Delete,
            contentDescription = "Delete Task"
        )

    }
}