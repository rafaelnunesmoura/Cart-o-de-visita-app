package com.example.cartaodevisitas.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cartaodevisitas.data.BusinessCard
import com.example.cartaodevisitas.data.BusinessCardRepository

class MainViewModel(private val businessCardRepository: BusinessCardRepository): ViewModel() {


    fun insert(businessCard: BusinessCard) {
        businessCardRepository.insert(businessCard)
    }

    fun getAll(): LiveData<BusinessCard> {
        return businessCardRepository.getAll()
    }
}
