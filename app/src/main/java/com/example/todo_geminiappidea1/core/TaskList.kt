package com.example.todo_geminiappidea1.core

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.todo_geminiappidea1.data.Task
import com.example.todo_geminiappidea1.task.TaskItem

@Composable
fun TaskList(tasks: List<Task>) {
    LazyColumn {
        items(tasks) { task ->
            TaskItem(task)
        }
    }
}