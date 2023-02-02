package com.latlng.foodradar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;

public class FeedsFragment extends Fragment {

    View view;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_feeds, container, false);
        // Inflate the layout for this fragment

        FeedsAdapter fAdapter;
        ArrayList arr = new ArrayList<>(Arrays.asList(R.drawable.img_post,R.drawable.img_post2,R.drawable.img_post2));

        recyclerView = view.findViewById(R.id.recyclerData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        fAdapter = new FeedsAdapter(getContext(),arr);
        recyclerView.setAdapter(fAdapter);



        return view;
    }
}