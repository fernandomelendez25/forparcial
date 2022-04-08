package com.melendez.forparcial

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var teamAName = MutableLiveData("")
    var teamBName = MutableLiveData("")
    var teamAScore = MutableLiveData(0)
    var teamBScore = MutableLiveData(0)
}