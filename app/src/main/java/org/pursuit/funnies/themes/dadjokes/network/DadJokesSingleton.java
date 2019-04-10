package org.pursuit.funnies.themes.dadjokes.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DadJokesSingleton {
    private static final String BASE_URL = "https://icanhazdadjoke.com";
    private static Retrofit retrofitInstance;

    public static Retrofit getInstance() {
        if (retrofitInstance != null) {
            return retrofitInstance;
        }
//        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//        httpClient.addInterceptor(new Interceptor() {
//            @SuppressWarnings("NullableProblems")
//            @Override
//            public Response intercept(Chain chain) throws IOException {
//                Request original = chain.request();
//
//                Request request = original.newBuilder()
//                        .header("User-Agent", "Funnies")
//                        .header("Accept", "application/json")
//                        .method(original.method(), original.body())
//                        .build();
//
//                return chain.proceed(request);
//            }
//        });
//        OkHttpClient client = httpClient.build();

        retrofitInstance = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofitInstance;
    }

    private DadJokesSingleton() {
    }
}
