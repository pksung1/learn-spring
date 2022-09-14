package com.example.bank_example.datasource.mock

import com.example.bank_example.datasource.BankDataSource
import com.example.bank_example.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks =  listOf(
            Bank("938-429032-4823", 0.6, 2),
            Bank("938-429032-4823", 13.6, 4),
            Bank("938-429032-4823", 0.6, 3)
    )
    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBank(accountNumber: String): Bank {
        return banks.first { it.accountNumber == accountNumber }
    }


}