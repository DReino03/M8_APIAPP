package com.reinosa.mynews.Routes

sealed class Routes(val route: String) {
    object launchScreen:Routes("launchScreen")
    object homeScreen:Routes("homeScreen")
    object favScreen:Routes("favScreen")
    object profileScreen:Routes("ProfileScreen")

}