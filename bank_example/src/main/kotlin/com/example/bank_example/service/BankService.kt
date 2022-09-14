package com.example.bank_example.service

import com.example.bank_example.datasource.BankDataSource
import com.example.bank_example.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> {
        return dataSource.retrieveBanks()
    }

    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
}