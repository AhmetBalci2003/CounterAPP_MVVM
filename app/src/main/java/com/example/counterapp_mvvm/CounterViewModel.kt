package com.example.counterapp_mvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel():ViewModel() {

    private  val _repository: CounterRepository=CounterRepository()
   private val _count =mutableStateOf(_repository.getcounter().count)

    val count:MutableState<Int> =_count

    fun increment()
    {
        _repository.increment()
        _count.value=_repository.getcounter().count

    }
    fun decrement()
    {
        _repository.decrement()
        _count.value=_repository.getcounter().count
    }


}