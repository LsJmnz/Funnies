package org.pursuit.funnies.themes.dadjokes.network;

import org.pursuit.funnies.themes.dadjokes.models.Joke;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DadJokesService {

    @GET("joke")
    Call<Joke> getJoke();
}
