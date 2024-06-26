@file:Suppress("PreviewAnnotationInFunctionWithParameters")

package com.example.todo_geminiappidea1.task

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo_geminiappidea1.core.MarkTaskComplete
import com.example.todo_geminiappidea1.data.Task

@Composable
fun TaskItem(task: Task) {
    Card {
        //TODO: Find a way to fix this Task Item to look good
        Row {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.Start,
            ) {
                Text(text = task.title, style = MaterialTheme.typography.headlineSmall)
                //Text(text = task.isCompleted, style = MaterialTheme.typography.bodyMedium)
                Row {
                    Row(
                        modifier = Modifier
                            .padding(5.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Button(onClick = { /* Edit task */ }) {
                            Text(text = "Edit")
                        }
                        Button(onClick = { /* Delete task */ }) {
                            Text(text = "Delete")
                        }

                    }

                    //TODO Figure out how to move the button away from the screen edge.
                    MarkTaskComplete(
                        task = task
                    ) {

                    }
                    Spacer(modifier = Modifier.padding(16.dp))
                }
            }
        }
        }
    }