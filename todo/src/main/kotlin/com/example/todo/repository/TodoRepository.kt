package com.example.todo.repository

import com.example.todo.repository.model.TodoEntity
import org.springframework.data.repository.CrudRepository

interface TodoRepository: CrudRepository<TodoEntity, Long> {
}