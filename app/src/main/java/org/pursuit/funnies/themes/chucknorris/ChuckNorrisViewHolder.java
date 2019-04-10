package org.pursuit.funnies.themes.chucknorris;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.pursuit.funnies.R;

public class ChuckNorrisViewHolder extends RecyclerView.ViewHolder {
    TextView chuckNorrisTextView;

    public ChuckNorrisViewHolder(@NonNull View itemView) {
        super(itemView);
        chuckNorrisTextView = itemView.findViewById(R.id.joke_text_view);
    }

    public void onBind(String joke) {

    }
}
