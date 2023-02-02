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


public class MessageFragment extends Fragment {
    View view1;
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view1 = inflater.inflate(R.layout.fragment_message, container, false);
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(R.drawable.img_user1,R.drawable.img_user2,R.drawable.img_user3,R.drawable.img_user4,R.drawable.img_user5,R.drawable.img_user6,R.drawable.img_user7));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("Chawanun Peng","Bendemeer Food Centre","Amos Cineleisure Orchard", "Wanton Mee", "Bakery Cuisine", "Tong Lai Eating House","Pine Garden’s Cake"));

        // Inflate
        MessageAdapter mAdapter;
        recyclerView = view1.findViewById(R.id.rView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new MessageAdapter(getContext(), arr2, arr1);
        recyclerView.setAdapter(mAdapter);



        return view1;
    }
}