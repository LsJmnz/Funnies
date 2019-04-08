package org.pursuit.funnies.themes.dadjokes;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.pursuit.funnies.R;
import org.pursuit.funnies.themes.dadjokes.models.Joke;

public class DadJokesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView textView;
    private Joke joke;

    public DadJokesViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.dad_joke_text_view);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    public void onBind(int position){
        textView.setText(joke.getJoke());
    }
}
