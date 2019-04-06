package org.pursuit.funnies.themes.chucknorris;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.funnies.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChuckNorrisDetailFragment extends Fragment {


    public ChuckNorrisDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chuck_norris_detail, container, false);
    }

}
