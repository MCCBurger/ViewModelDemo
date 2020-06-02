package com.ebookfrenzy.viewmodeldemo.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {

    private val usd_to_eu_rate = 0.74f
    //private var dollarText = ""
    var dollarValue:MutableLiveData<String> = MutableLiveData()
    var result:MutableLiveData <Float> =MutableLiveData()

    fun convertValue(){
        dollarValue.let {
            if(!it.value.equals("")){
                result.value = it.value?.toFloat()?.times(usd_to_eu_rate)
            }
            else{
                result.value=0f
            }
        }
    }

    /*fun setAmount(value:String){
        this.dollarText = value
        result.value = (value.toFloat()*usd_to_eu_rate)
    }

    fun getResult():MutableLiveData<Float>{
        return result
    }*/
}