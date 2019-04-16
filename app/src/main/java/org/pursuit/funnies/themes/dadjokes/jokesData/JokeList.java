package org.pursuit.funnies.themes.dadjokes.jokesData;

import org.pursuit.funnies.themes.dadjokes.models.Joke;

import java.util.ArrayList;
import java.util.List;

public class JokeList {
    private static List<Joke> jokeList = new ArrayList<>();

    public static void makeList(Joke joke){
        jokeList.add(joke);
    }

    public static List<Joke> getJokeList(){
        return jokeList;
    }

}
