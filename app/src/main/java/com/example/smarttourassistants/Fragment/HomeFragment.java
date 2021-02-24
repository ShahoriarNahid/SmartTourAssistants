package com.example.smarttourassistants.Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.smarttourassistants.DistrictActivity;
import com.example.smarttourassistants.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {



    public HomeFragment() {
        // Required empty public constructor

    }

    View v;
    private CardView dhaka,rajshahi,barishal,chittagong,mymensingh,khulna,rangpur,sylet;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_home, container, false);


        dhaka= (CardView) v.findViewById(R.id.dhaka);
        rajshahi= (CardView) v.findViewById(R.id.rajshahi);
        chittagong=(CardView) v.findViewById(R.id.chittagong);
        mymensingh=(CardView) v.findViewById(R.id.mymensingh);
        khulna=(CardView) v.findViewById(R.id.barishal);
        rangpur=(CardView) v.findViewById(R.id.rangpur);
        sylet=(CardView) v.findViewById(R.id.sylet);
        barishal= (CardView) v.findViewById(R.id.barishal);

        dhaka.setOnClickListener(this);
        rajshahi.setOnClickListener(this);
        chittagong.setOnClickListener(this);
        mymensingh.setOnClickListener(this);
        khulna.setOnClickListener(this);
        rangpur.setOnClickListener(this);
        sylet.setOnClickListener(this);
        barishal.setOnClickListener(this);

        return v;

    }


    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.dhaka:
             i=   new Intent(getActivity().getApplication(), DistrictActivity.class);
             startActivity(i);
                break;
            case R.id.rajshahi:
                i=   new Intent(getActivity().getApplication(), DistrictActivity.class);
                startActivity(i);
                break;
            case R.id.chittagong:
                i=   new Intent(getActivity().getApplication(), DistrictActivity.class);
                startActivity(i);
                break;
            case R.id.rangpur:
                i=   new Intent(getActivity().getApplication(), DistrictActivity.class);
                startActivity(i);
                break;
            case R.id.mymensingh:
                i=   new Intent(getActivity().getApplication(), DistrictActivity.class);
                startActivity(i);
                break;
            case R.id.sylet:
                i=   new Intent(getActivity().getApplication(), DistrictActivity.class);
                startActivity(i);
                break;
            case R.id.khulna:
                i=   new Intent(getActivity().getApplication(), DistrictActivity.class);
                startActivity(i);
                break;
            case R.id.barishal:
                i=   new Intent(getActivity().getApplication(), DistrictActivity.class);
                startActivity(i);
                break;

        }

    }
}
