package com.reinosa.apilist.ViewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.reinosa.mynews.API.Repository
import com.reinosa.mynews.Model.Data
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class APIViewModel: ViewModel() {

    private val repository = Repository()
    private val _loading = MutableLiveData(true)
    val loading = _loading
    private val _noticias = MutableLiveData<Data>()
    val noticias = _noticias


    fun getNoticias() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = repository.getNoticia()
            withContext(Dispatchers.Main) {
                if(response.isSuccessful){
                    println("ERROR:${response.body()} ")
                    _noticias.value = response.body()
                    _loading.value = false
                }
                else{
                    Log.e("Error :", response.message())
                }
            }
        }
    }
    fun onSearchTextChange(text: String) {
        Log.d("APIViewModel", "onSearchTextChange: $text")
    }
    fun searchText() {
        //el text que es mostra a la caixa de text.

    }

}