package org.pursuit.funnies.themes.chucknorris;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.funnies.R;

public class ChuckNorrisRecyclerViewFragment extends Fragment {

    public ChuckNorrisRecyclerViewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chuch_norris, container, false);
    }

}
