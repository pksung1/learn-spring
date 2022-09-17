package com.example.todo.dto

data class TodoDto(
    val id: Long?,
    val todo: String,
    val checked: Boolean = false,
)