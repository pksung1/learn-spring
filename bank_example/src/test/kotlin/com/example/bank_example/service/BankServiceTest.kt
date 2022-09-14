package com.example.bank_example.service

import com.example.bank_example.datasource.BankDataSource
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankServiceTest(
        private val dataSource: BankDataSource = mockk(relaxed = true),
        private val bankService: BankService = BankService(dataSource)
) {
    @Test
    fun `should call its data source to retrieve banks`() {
        bankService.getBanks()

        verify(exactly = 1) { dataSource.retrieveBanks() }
    }

    @Test
    fun `get on bank`() {
        val accountNumber = "938-429032-4823"
        bankService.getBank(accountNumber)
        verify(exactly = 1) {dataSource.retrieveBank("938-429032-4823")}
    }

}