package org.pursuit.funnies.themes.dadjokes.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import android.view.View;
import android.widget.TextView;

import org.pursuit.funnies.R;

import org.pursuit.funnies.themes.dadjokes.models.Joke;



public class DadJokesViewHolder extends RecyclerView.ViewHolder {
    private static final String TAG = "DadJokesViewHolder";
    public  TextView dadJokeTextView;

    DadJokesViewHolder(@NonNull View itemView) {
        super(itemView);

    }

    public void onBind(Joke joke){

    dadJokeTextView= itemView.findViewById(R.id.joke_text_view);


    }
}
