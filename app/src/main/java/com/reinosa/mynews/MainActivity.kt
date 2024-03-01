package com.reinosa.mynews

import MyAppContent
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.reinosa.apilist.ViewModel.APIViewModel
import com.reinosa.mynews.Routes.MyAppNavegationActions
import com.reinosa.mynews.Routes.MyAppRoute
import com.reinosa.mynews.Routes.Routes
import com.reinosa.mynews.View.ProfileScreen
import com.reinosa.mynews.View.Recycler.MyRecyclerView
import com.reinosa.mynews.View.favScreen
import com.reinosa.mynews.View.homeScreen
import com.reinosa.mynews.View.launchScreen
import com.reinosa.mynews.ui.theme.MyNewsTheme
val viewModel = APIViewModel()
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavegationGraph()


            }
        }
    }
}

@Composable
fun NavegationGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.launchScreen.route) {
        composable(route = Routes.launchScreen.route) {
            launchScreen(navController)
        }
        composable(route = Routes.homeScreen.route) {
            homeScreen(viewModel = viewModel)
        }
        composable(route = Routes.favScreen.route) {
            favScreen()

        }
        composable(route = Routes.profileScreen.route) {
            ProfileScreen()
        }
    }
}
}