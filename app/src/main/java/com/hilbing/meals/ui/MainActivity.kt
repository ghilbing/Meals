package com.hilbing.meals.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.hilbing.meals.ui.meals.MealsCategoriesScreen
import com.hilbing.meals.ui.theme.MealsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MealsTheme {
                    MealsCategoriesScreen()
            }
        }
    }
}

