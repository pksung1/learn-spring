package com.example.bank_example.controller

import com.example.bank_example.model.Bank
import com.example.bank_example.service.BankService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/banks")
class BankController @Autowired constructor(
        private val service: BankService
) {

    @ExceptionHandler
    fun handleNotFound(e: Exception): ResponseEntity<String> = ResponseEntity(e.message, HttpStatus.NOT_FOUND)

    @GetMapping
    fun getBanks(): Collection<Bank> = service.getBanks()


    @GetMapping("/{accountNumber}")
    fun getBank(@PathVariable accountNumber: String): Bank = service.getBank(accountNumber)
}