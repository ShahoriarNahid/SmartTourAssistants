package com.example.smarttourassistants.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smarttourassistants.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SuggestedPlaceFragment extends Fragment {


    public SuggestedPlaceFragment() {
        // Required empty public constructor
    }


    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =  inflater.inflate(R.layout.fragment_suggested_place, container, false);
        return v;
    }

}
