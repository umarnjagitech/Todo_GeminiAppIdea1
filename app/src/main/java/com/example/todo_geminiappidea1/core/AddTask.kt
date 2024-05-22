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

@Composable
fun AddTask(onAddTask: (String) -> Unit) {
    // Implement the UI for adding a task

    var taskName by rememberSaveable {
        mutableStateOf("")
    }

    Column {
        OutlinedTextField(
            value = taskName,
            onValueChange = { taskName = it },
            label = { Text("Task Name") }
        )

        Button(onClick = {
            onAddTask(taskName)
            taskName = ""
        }) {
            Text("Add")
        }
    }


}