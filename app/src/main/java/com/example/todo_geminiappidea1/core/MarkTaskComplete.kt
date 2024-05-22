package com.example.todo_geminiappidea1.core

import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import com.example.todo_geminiappidea1.data.Task

@Composable
fun MarkTaskComplete(
    task: Task,
    onToggleTaskComplete: (Task) -> Unit,
){
    Checkbox(
        checked = task.isCompleted,
        onCheckedChange = {
            onToggleTaskComplete(task.copy(isCompleted = it))
        }
    )
}