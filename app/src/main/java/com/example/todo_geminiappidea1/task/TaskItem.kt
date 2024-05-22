package com.example.todo_geminiappidea1.task

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.todo_geminiappidea1.data.Task

@Composable
fun TaskItem(task: Task) {
    Card {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = task.title, style = MaterialTheme.typography.headlineSmall)
            //Text(text = task.isCompleted, style = MaterialTheme.typography.bodyMedium)
            Row {
                Button(onClick = { /* Edit task */ }) {
                    Text(text = "Edit")
                }
                Button(onClick = { /* Delete task */ }) {
                    Text(text = "Delete")
                }
            }
        }
    }
}