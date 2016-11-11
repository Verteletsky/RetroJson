package com.nowandroid.retrofitjson.api;

import com.nowandroid.retrofitjson.model.ContactList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
 
    /*
    Retrofit get annotation with our URL
    And our method that will return us the List of ContactList
    */
    @GET("/lessons/retrofit-json/json_data.json")
    Call<ContactList> getMyJSON();
}