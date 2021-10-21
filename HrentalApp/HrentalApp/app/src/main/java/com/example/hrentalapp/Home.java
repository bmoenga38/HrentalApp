package com.example.hrentalapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Home extends Fragment {


    public Home() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ListView listView = view.findViewById(R.id.ourrooms);
        String houses [] = {"Single rooms","Bedsitters","One bedroom","Two bedrooms"};
        ArrayAdapter itemsAdapter = new ArrayAdapter (getContext(), R.layout.samplelist, houses);
        listView.setAdapter(itemsAdapter);



        return view;
    }
}