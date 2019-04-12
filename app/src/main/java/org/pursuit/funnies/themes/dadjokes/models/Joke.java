package org.pursuit.funnies.themes.dadjokes.models;

import java.util.ArrayList;

public class Joke {
	private String id;
	private String joke;
	private int status;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setJoke(String joke){
		this.joke = joke;
	}

	public String getJoke(){
		return joke;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	public Joke(String id, String joke, int status) {
		this.id = id;
		this.joke = joke;
		this.status = status;
	}

	private Joke() {
	}

	public static ArrayList<Joke> createJokeList(int numJokes) {
		ArrayList<Joke> jokesList = new ArrayList<>();

		for (int i = 1; i <= numJokes; i++) {
			jokesList.add(new Joke());
		}

		return jokesList;
	}
}
