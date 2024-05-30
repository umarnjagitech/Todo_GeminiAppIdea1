package com.example.todo_geminiappidea1.core

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.todo_geminiappidea1.data.Task
import com.example.todo_geminiappidea1.task.TaskItem

@Composable
fun TaskList(tasks: List<Task>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(9.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        items(tasks) { task ->
            TaskItem(task)
        }
    }
}