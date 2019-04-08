package org.pursuit.funnies.themes.dadjokes.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DadJokesSingleton {
    private static final String BASE_URL = "https://icanhazdadjoke.com/";
    private static Retrofit retrofitInstance;
   
    public static Retrofit getInstance() {
        if (retrofitInstance != null) {
            return retrofitInstance;
        }
        retrofitInstance = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofitInstance;
    }

    private DadJokesSingleton() {}
}
