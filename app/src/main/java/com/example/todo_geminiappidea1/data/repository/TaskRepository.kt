package com.example.todo_geminiappidea1.data.repository

import com.example.todo_geminiappidea1.data.Task
import com.example.todo_geminiappidea1.data.source.TaskDataSource

class TaskRepository (
    private val dataSource: TaskDataSource
) {
    fun addTask(task: Task) =
        dataSource.addTask(task)
    fun getAllTasks() = dataSource.getAllTasks()

    fun getTaskById(id: Int) = dataSource.getTaskById(id)

    fun removeTask(task: Task) = dataSource.deleteTask(task)

    fun updateTask(task: Task) = dataSource.updateTask(task)

}