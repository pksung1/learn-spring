package com.example.bank_example.datasource.mock

import com.example.bank_example.datasource.BankDataSource
import com.example.bank_example.model.Bank

class MockBankDataSource : BankDataSource {

    override fun retrieveBanks(): Collection<Bank> {
        return listOf(
            Bank("938-429032-4823", 0.6, 2),
            Bank("938-429032-4823", 13.6, 4),
            Bank("938-429032-4823", 0.6, 3)
        )
    }


}