package com.reinosa.mynews.Model

data class Data(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
