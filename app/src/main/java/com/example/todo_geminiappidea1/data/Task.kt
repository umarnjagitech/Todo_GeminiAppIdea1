package com.example.todo_geminiappidea1.data

data class Task (
    val id: Int,
    var title: String,
    var description: String,
    var isCompleted: Boolean
)