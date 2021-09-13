package com.hilbing.meals.ui.meals

import androidx.lifecycle.ViewModel
import com.hilbing.meals.model.MealsRepository
import com.hilbing.meals.model.response.MealResponse

class MealCategoriesViewModel (private val repository: MealsRepository = MealsRepository()): ViewModel(){
    fun getMeals(): List<MealResponse>{
        return repository.getMeals().categories
    }

}