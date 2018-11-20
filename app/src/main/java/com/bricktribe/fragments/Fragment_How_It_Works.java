package com.bricktribe.fragments;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bricktribe.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_How_It_Works extends Fragment {


    public Fragment_How_It_Works() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_how_it_works, container, false);
    }

}
