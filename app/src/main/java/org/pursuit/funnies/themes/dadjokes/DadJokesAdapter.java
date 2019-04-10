package org.pursuit.funnies.themes.dadjokes;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.pursuit.funnies.R;

import java.util.ArrayList;
import java.util.List;

public class DadJokesAdapter extends RecyclerView.Adapter<DadJokesViewHolder> {
    List<String> jokeList;
    TextView textView;


    @NonNull
    @Override
    public DadJokesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view,viewGroup,false);
        return new DadJokesViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull DadJokesViewHolder dadJokesViewHolder, int i) {
    dadJokesViewHolder.onBind(jokeList.get(i));
        CardView cardView = dadJokesViewHolder.cardView;

    }


    @Override
    public int getItemCount() {
        return jokeList.size();
    }
}
