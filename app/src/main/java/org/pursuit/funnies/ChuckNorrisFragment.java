package org.pursuit.funnies;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.funnies.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChuckNorrisFragment extends Fragment {


    public ChuckNorrisFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chuch_norris, container, false);
    }


}
