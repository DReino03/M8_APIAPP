package com.reinosa.mynews.View.Recycler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.reinosa.mynews.Model.Article

@Composable
fun newsItem(noticia: Article) {
    Card(
        modifier = Modifier.fillMaxWidth()) {
            Row() {

                Column {
                    Text(text = noticia.title, fontFamily = androidx.compose.ui.text.font.FontFamily.Serif)
                    Spacer(modifier = Modifier.padding(4.dp))
                    Text(text = noticia.description)
                    //Text(text = noticia.publishedAt)
                }
            }

    }
}