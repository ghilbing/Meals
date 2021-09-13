package com.hilbing.meals.model

import com.hilbing.meals.model.api.MealsWebService
import com.hilbing.meals.model.response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MealsRepository (private val webService: MealsWebService = MealsWebService()){
    suspend fun getMeals(): MealsCategoriesResponse {
        return webService.getMeals()

    }
}