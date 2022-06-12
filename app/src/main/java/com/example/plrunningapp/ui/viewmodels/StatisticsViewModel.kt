package com.example.plrunningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.plrunningapp.repositories.MainRepository

class StatisticsViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
): ViewModel() {

}