package com.reinosa.mynews.View

import MyAppContent
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.reinosa.apilist.ViewModel.APIViewModel
import com.reinosa.mynews.Routes.MyAppNavegationActions
import com.reinosa.mynews.Routes.MyAppRoute
import com.reinosa.mynews.View.Recycler.MyRecyclerView




@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun homeScreen(viewModel: ViewModel) {
    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = androidx.compose.ui.Alignment.Center) {
        Text(text ="Home Screen",
            fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,

        )

    }

}