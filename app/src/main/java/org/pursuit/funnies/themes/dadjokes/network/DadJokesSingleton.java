package org.pursuit.funnies.themes.dadjokes.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DadJokesSingleton {
    private static final String BASE_URL = "https://icanhazdadjoke.com/";
    private static Retrofit ourInstance;
   
    public static Retrofit getInstance() {
        if (ourInstance != null) {
            return ourInstance;
        }
        ourInstance = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return ourInstance;
    }

    private DadJokesSingleton() {}
}
