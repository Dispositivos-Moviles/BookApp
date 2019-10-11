package com.nickgonzalezs.bookapp.api;

import com.nickgonzalezs.bookapp.model.AccessToken;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface BookService {

    // TODO: domain.com/api/

    // TODO: Cambiar 'String' por 'AccessToken'
    @POST("register")
    @FormUrlEncoded
    Call<AccessToken> register(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password
    );

    @POST("login")
    @FormUrlEncoded
    Call<AccessToken> login(
            @Field("email") String email,
            @Field("password") String password
    );

    @POST("refresh")
    @FormUrlEncoded
    Call<AccessToken> refreshToken(
            @Field("refresh_Token") String refreshToken
    );


}
