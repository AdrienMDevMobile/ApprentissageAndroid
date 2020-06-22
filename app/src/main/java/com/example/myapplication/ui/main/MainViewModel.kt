package com.example.myapplication.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//This view model will transfer the value from one activity to the other
class MainViewModel : ViewModel() {
    // Il faut passer par un objet mutable pour qu'il soit ensuite observé.
    internal val communicationText = MutableLiveData<String>()

    fun communicateText(s: String){
        communicationText.value = s
    }
}
