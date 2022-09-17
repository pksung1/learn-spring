package com.example.todo.domain.todo

import com.example.todo.dto.TodoDto
import com.example.todo.dto.UserDto

interface TodoService {

    fun create(todoDto: TodoDto)

    fun delete(todoDto: TodoDto)

    fun edit(todoDto: TodoDto)

    fun check(todoDto: TodoDto)
}