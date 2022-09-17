package com.example.todo.repository.model

import javax.persistence.*

@Entity
@Table(name = "todo")
class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    val todo: String? = null
}