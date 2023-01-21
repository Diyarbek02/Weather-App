package com.karsoft.weatherappcourse

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karsoft.weatherappcourse.adapters.WeatherModel

class MainViewModel: ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}