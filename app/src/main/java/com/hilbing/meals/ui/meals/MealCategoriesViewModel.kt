package com.hilbing.meals.ui.meals

import androidx.lifecycle.ViewModel
import com.hilbing.meals.model.MealsRepository
import com.hilbing.meals.model.response.MealResponse
import com.hilbing.meals.model.response.MealsCategoriesResponse

class MealCategoriesViewModel (private val repository: MealsRepository = MealsRepository()): ViewModel(){
    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit){
        repository.getMeals { response ->
            successCallback(response)

        }
    }

}