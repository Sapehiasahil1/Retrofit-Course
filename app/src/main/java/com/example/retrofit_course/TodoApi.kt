package com.example.retrofit_course

import retrofit2.Response
import retrofit2.http.GET

// Here we define all the functions that we need to access our api.
interface TodoApi {
/*
 Four Types of requests :-
 1. GET -> to get the data from the remote server [ if we want to add authorization key that the server accepts @Query]
 2. POST -> to post/add the data to the remote server [ if we want to add the data to server @Body]
 3. PUT -> to update the data at the remote server
 4. DELETE -> to delete the data from the remote server
*/
    @GET("/todos")
    suspend fun getTodos() : Response<List<Todo>>
}