package org.pursuit.funnies.themes.dadjokes.network;

import org.pursuit.funnies.themes.dadjokes.models.Joke;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Headers;

public interface DadJokesService {

    @Headers({
            "Accept: application/json",
            "User-Agent: org.pursuit.funnies"
    })
    @GET("/")
    Call<Joke> getJoke();
}
