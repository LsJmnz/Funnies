package org.pursuit.funnies.themes.chucknorris.network;

import org.pursuit.funnies.themes.chucknorris.models.ChuckNorrisJoke;
import org.pursuit.funnies.themes.chucknorris.models.JokeCategory;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ChuckNorrisService {
    @GET("api.chucknorris.io/jokes/categories")
    Call<JokeCategory> getJokeCategories();

    @GET("https://api.chucknorris.io/jokes/random?category={category}")
    Call<ChuckNorrisJoke> getJokeId(@Query("category") String jokeId);
}
