package com.hilbing.meals.model

import com.hilbing.meals.model.api.MealsWebService
import com.hilbing.meals.model.response.MealResponse
import com.hilbing.meals.model.response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MealsRepository (private val webService: MealsWebService = MealsWebService()){

    private var cachedMeals = listOf<MealResponse>()

    suspend fun getMeals(): MealsCategoriesResponse {
        val response = webService.getMeals()
        cachedMeals = response.categories
        return response

    }

    fun getMeal(id: String): MealResponse?{
       return cachedMeals.firstOrNull(){
            it.id == id
        }
    }

    companion object {
        @Volatile
        private var instance: MealsRepository? = null
        fun getInstance() = instance?: synchronized(this){
            instance?: MealsRepository().also { instance = it }
        }
    }

}