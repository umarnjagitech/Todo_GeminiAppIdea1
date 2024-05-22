package com.example.todo_geminiappidea1.data.source

import com.example.todo_geminiappidea1.data.Task

class TaskDataSource {
    private val tasks = mutableListOf<Task>()

    fun addTask(task: Task) {
        tasks.add(task)
    }

    fun getAllTasks(): List<Task> {
        return tasks
    }

    fun getTaskById(id: Int): Task? {
        return tasks.find { it.id == id }
    }


    fun deleteTask(task: Task) {
        tasks.remove(task)
    }

    fun updateTask(task: Task) {
        val existingTask = tasks.find { it.id == task.id }
        existingTask?.let {
            it.title = task.title
            it.description = task.description
            it.isCompleted = task.isCompleted
        }
    }
}