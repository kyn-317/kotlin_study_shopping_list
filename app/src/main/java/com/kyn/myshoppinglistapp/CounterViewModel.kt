package com.kyn.myshoppinglistapp

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CounterViewModel(): ViewModel() {
    private val _repository : CounterRepository = CounterRepository()
    private val _count = mutableStateOf(_repository.getCounter().count)


    val count: MutableState<Int> = _count

    fun increment(){
        _repository.incrementCoutner()
        _count.value = _repository.getCounter().count
    }

    fun decrement(){
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }



//    private val _count = MutableStateFlow(0)
//    val count : StateFlow<Int> = _count.asStateFlow()
//
//    fun increment(){
//        _count.update{
//            currentState -> currentState + 1
//        }
//    }
//
//    fun decrement(){
//        _count.update{
//            currentState -> currentState - 1
//        }
//
//    }


}