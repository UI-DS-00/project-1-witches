package com.example.imdb

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.imdb.api.RetrofitInstance
import com.example.imdb.api.RetrofitInstance.API_KEY
import com.example.imdb.api.RetrofitService
import com.example.imdb.model.Account
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class AccountViewModel: ViewModel() {
    // Live Data
    var accountDataList = MutableLiveData<ArrayList<Account>>()

    fun getAccountData(){
        val retrofitService = RetrofitInstance.getRetrofitInstance().create(RetrofitService::class.java)
        retrofitService.getAccount(API_KEY).enqueue(object : Callback<ArrayList<Account>>{
            override fun onResponse(
                call: Call<ArrayList<Account>>,
                response: Response<ArrayList<Account>>
            ) {
                accountDataList.value = response.body()
            }

            override fun onFailure(call: Call<ArrayList<Account>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }

}