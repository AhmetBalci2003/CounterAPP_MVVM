package com.example.counterapp_mvvm

data class CounterModel(var count:Int) {

}

class CounterRepository {

  private  var _counter=CounterModel(0)

    fun getcounter()=_counter

    fun increment()
    {
        _counter.count++

    }
    fun decrement()
    {
        _counter.count--

    }



}