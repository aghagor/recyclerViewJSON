package com.example.goro.applikegmail.network;

import com.example.goro.applikegmail.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Goro on 16.12.2017.
 */

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<Message>> getInbox();

}
