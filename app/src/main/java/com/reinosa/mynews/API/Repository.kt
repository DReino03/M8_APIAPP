package com.reinosa.mynews.API



class Repository {
        val apiInterface = ApiInterface.create()
        suspend fun getNoticia() = apiInterface.getNoticias()

        //val daoInterface =
}