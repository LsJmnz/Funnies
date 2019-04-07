package org.pursuit.funnies.themes.dadjokes.models;

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

	@Override
 	public String toString(){
		return 
			"Joke{" +
			"id = '" + id + '\'' + 
			",joke = '" + joke + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
