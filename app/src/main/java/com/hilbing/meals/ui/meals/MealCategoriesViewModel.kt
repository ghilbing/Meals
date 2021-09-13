package com.hilbing.meals.ui.meals

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hilbing.meals.model.MealsRepository
import com.hilbing.meals.model.response.MealResponse
import kotlinx.coroutines.*

class MealCategoriesViewModel (private val repository: MealsRepository = MealsRepository()): ViewModel(){

    init {

        viewModelScope.launch(Dispatchers.IO){
            val meals = getMeals()
                mealsState.value = meals
        }

    }

    val mealsState: MutableState<List<MealResponse>> = mutableStateOf(emptyList<MealResponse>())


    private suspend fun getMeals(): List<MealResponse>{
        return repository.getMeals().categories

    }

}