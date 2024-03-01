import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.reinosa.mynews.Routes.MyAppRoute
import com.reinosa.mynews.Routes.MyAppTopLevelDestination
import com.reinosa.mynews.Routes.TOP_LEVEL_DESTINATIONS
import com.reinosa.mynews.View.ProfileScreen
import com.reinosa.mynews.View.favScreen
import com.reinosa.mynews.View.homeScreen
import com.reinosa.mynews.viewModel

@Composable
fun MyAppContent(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    selectedDestination: String,
    navigateTopLevelDestination: (MyAppTopLevelDestination) -> Unit
){
    Row(modifier = modifier.fillMaxSize()){
        Column(modifier = Modifier.fillMaxSize()){
            NavHost(
                modifier = modifier.weight(1f),
                navController = navController,
                startDestination = MyAppRoute.Home){
                composable(MyAppRoute.Home){
                    homeScreen(viewModel = viewModel)
                }
                composable(MyAppRoute.Fav){
                    favScreen()
                }
                composable(MyAppRoute.Profile){
                    ProfileScreen()
                }
            }
            MyAppBottomNavigationBar(
                selectedDestination = selectedDestination,
                navigateTopLevelDestination = navigateTopLevelDestination)

        }

    }
}

@Composable
fun MyAppBottomNavigationBar(
    selectedDestination: String,
    navigateTopLevelDestination: (MyAppTopLevelDestination) -> Unit
) {
    NavigationBar(modifier = Modifier.fillMaxWidth()) {
        TOP_LEVEL_DESTINATIONS.forEach { destination ->
            NavigationBarItem(
                selected = selectedDestination == destination.route,
                onClick = { navigateTopLevelDestination(destination) },
                icon = {
                    androidx.compose.material3.Icon(
                        imageVector = destination.selectedIcon,
                        contentDescription = stringResource(id = destination.iconTextId)
                    )
                },
            )
        }
    }
}
