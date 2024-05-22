package com.example.todo_geminiappidea1.domain.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.todo_geminiappidea1.data.Task
import com.example.todo_geminiappidea1.data.repository.TaskRepository
import kotlinx.coroutines.flow.asFlow

class TaskViewModel(
    private val repository: TaskRepository
): ViewModel() {
    val tasks: LiveData<Task> = repository.getAllTasks().asFlow().asLiveData()

    fun addTask(task: Task) = repository.addTask(task)

    fun deleteTask(task: Task) = repository.removeTask(task)

    fun updateTask(task: Task) = repository.updateTask(task)

}