package org.pursuit.funnies.themes.dadjokes;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.pursuit.funnies.R;

public class DadJokesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public CardView cardView;
    private TextView textView;
    Intent intent;


    public DadJokesViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.joke_text_view);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    public void onBind(String dadJoke){
        textView.setText(dadJoke);

    }
}
