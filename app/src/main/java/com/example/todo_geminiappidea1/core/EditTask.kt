package com.example.todo_geminiappidea1.core

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.example.todo_geminiappidea1.data.Task

@Composable
fun EditTask(task: Task, onEditTask: (Task) -> Unit) {
    var taskName by rememberSaveable {
        mutableStateOf("")
    }

    Column {
        OutlinedTextField(
            value = taskName,
            onValueChange = { taskName = it },
            label = { Text("Task name") }
        )
        Button(onClick = {
            onEditTask(task.copy(title = taskName))
        }) {
            Text("Save")
        }
    }
}