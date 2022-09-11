package com.example.bank_example.datasource

import com.example.bank_example.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>

}