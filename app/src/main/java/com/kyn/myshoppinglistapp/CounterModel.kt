package com.kyn.myshoppinglistapp

data class CounterModel (var count:Int)


class CounterRepository{
    private var _counter = CounterModel(0)
    fun getCounter() = _counter
    fun incrementCoutner(){
        _counter.count++
    }
    fun decrementCounter(){
        _counter.count--
    }

}