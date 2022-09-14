package com.example.bank_example.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of bank`() {
        // given


        // when
        val banks = mockDataSource.retrieveBanks()

        // then
        assertTrue(banks.isNotEmpty())

    }

    @Test
    fun `should provide some mock data`() {
        // given

        // when
        val banks = mockDataSource.retrieveBanks()

        // then
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0}
        assertThat(banks).allMatch { it.transactionFee != 0 }
    }

    @Test
    fun `find one bank`() {
        val accountNumber = "938-429032-4823"
        val bank = mockDataSource.retrieveBank(accountNumber)

        assertThat(bank.accountNumber).isEqualTo(accountNumber)
    }
}