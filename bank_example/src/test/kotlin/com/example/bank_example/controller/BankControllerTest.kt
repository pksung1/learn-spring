package com.example.bank_example.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
internal class BankControllerTest @Autowired constructor(
        private val mockMvc: MockMvc
) {


    @Test
    fun `should return all bank`() {

        mockMvc.get("/api/banks")
                .andDo { print() }
                .andExpect {
                    status { isOk() }
                    content { contentType(MediaType.APPLICATION_JSON) }
                    jsonPath("$[0].accountNumber") { value("938-429032-4823") }
                }
    }

    @Test
    fun `should return one bank`() {
        val accountNumber = "938-429032-4823"

        mockMvc.get("/api/banks/${accountNumber}")
                .andDo { print() }
                .andExpect {
                    status { isOk() }
                    content { contentType(MediaType.APPLICATION_JSON) }
                    jsonPath("accountNumber") {value(accountNumber)}
                }
    }

    @Test
    fun `not found bank`() {
        mockMvc.get("/api/banks/not_found")
                .andDo { print() }
                .andExpect {
                    status { isNotFound() }
                }
    }
}