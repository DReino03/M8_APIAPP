package com.reinosa.mynews.Model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.reinosa.mynews.Routes.Screens

data class NavItem(
    val label : String,
    val icon : ImageVector,
    val route : String

)

val listOfNavItems = listOf(
    NavItem("Home", Icons.Default.Home, Screens.homeScreen.name),
    NavItem("Favourites", Icons.Default.Favorite, Screens.favScreen.name),
    NavItem("Profile", Icons.Default.Person, Screens.profileScreen.name),
)