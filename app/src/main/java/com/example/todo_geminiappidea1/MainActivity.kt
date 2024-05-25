package com.example.todo_geminiappidea1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo_geminiappidea1.core.AddTask
import com.example.todo_geminiappidea1.core.DeleteTask
import com.example.todo_geminiappidea1.core.EditTask
import com.example.todo_geminiappidea1.core.MarkTaskComplete
import com.example.todo_geminiappidea1.core.TaskList
import com.example.todo_geminiappidea1.data.Task
import com.example.todo_geminiappidea1.ui.theme.Todo_GeminiAppIdea1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Todo_GeminiAppIdea1()
        }
    }
}

@Preview(
    showSystemUi = true, showBackground = true
)
@Composable
fun Todo_GeminiAppIdea1() {
    val tasks = listOf(
        Task(1, "Grocery shopping", "2024-08-01", false),
        Task(2, "Finish work report", "2024-08-05", false),
        Task(3, "Call the doctor", "2024-08-10", false),
        Task(4, "Pay bills", "2024-08-15", false),
        Task(5, "Go to the gym", "2024-08-20", false)
    )

    TaskList(tasks = tasks)
    AddTask(onAddTask = {})


    EditTask(task = tasks[0], onEditTask = {})
    DeleteTask(task = tasks[2], onDeleteTask = {})
    MarkTaskComplete(task = tasks[3], onToggleTaskComplete = {})

    // Ugly stuff - let's work on the UI next!!!

}