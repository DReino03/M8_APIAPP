package com.reinosa.mynews.Model

data class Results(
    val source: Source,
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String
) {
    data class Source(
        val id: Int,
        val name: String
    )
}