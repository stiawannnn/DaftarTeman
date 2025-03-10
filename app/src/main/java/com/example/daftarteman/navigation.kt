package com.example.daftarteman

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import androidx.navigation.NavType
import androidx.navigation.navArgument

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "list") {
        composable("list") { FriendListScreen(navController) }
        composable(
            "detail/{friendId}",
            arguments = listOf(navArgument("friendId") { type = NavType.IntType })
        ) { backStackEntry ->
            FriendDetailScreen(friendId = backStackEntry.arguments?.getInt("friendId")!!, navController)
        }
    }
}
