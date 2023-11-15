package com.example.worl0311.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation

object Marshroutes {
    val route1 = "Экран1"
    val route2 = "Экран2"
    val route3 = "Экран3"
    val route4 = "Экран4"
}

object Minimal0 {
    @Composable
    fun MinimalNavigation() {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = Marshroutes.route1) {

            composable(route = Marshroutes.route1) {
                Screen1(navController = navController)
            }
            composable(route = Marshroutes.route2) {
                Screen2()
            }
            composable(route = Marshroutes.route3) {
                Screen3()
            }
            composable(route =Marshroutes. route4) {
                Screen4()
            }
        }
    }
    @Composable
    fun Screen1(navController: NavController) {
        OutlinedCard(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp))
        {

            Column(modifier=Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {

                Button(onClick = { navController.navigate(Marshroutes.route2) }) {
                    Text(text = "экран2")
                }
                Button(onClick = { navController.navigate(Marshroutes.route3) }) {
                    Text(text = "экран3")
                }
                Button(onClick = { navController.navigate(Marshroutes.route4) }) {
                    Text(text = "экран4")
                }
            }
        }
    }
    @Composable
    fun Screen2() {
        OutlinedCard(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)) {
            Text("экран2")
        }
    }
    @Composable
    fun Screen3() {
        OutlinedCard(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)) {
            Text("экран3")
        }
    }
    @Composable
    fun Screen4() {
        OutlinedCard(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)) {
            Text("экран4")
        }
    }
}