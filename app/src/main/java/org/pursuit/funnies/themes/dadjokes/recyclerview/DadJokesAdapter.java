package org.pursuit.funnies.themes.dadjokes.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.pursuit.funnies.R;
import org.pursuit.funnies.themes.dadjokes.models.Joke;

import java.util.ArrayList;
import java.util.List;

public class DadJokesAdapter extends RecyclerView.Adapter<DadJokesViewHolder> {
   private List<Joke> jokeList;


    public DadJokesAdapter(List<Joke> jokeList) {
        this.jokeList = jokeList;

    }

    @NonNull
    @Override
    public DadJokesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_view,viewGroup,false);
        return new DadJokesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DadJokesViewHolder dadJokesViewHolder, int i) {
        dadJokesViewHolder.onBind(jokeList.get(i));
    }

    @Override
    public int getItemCount() {
        return jokeList.size();
    }
}
