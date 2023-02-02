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

public class ProfileFragment extends Fragment {
    View view;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_profile, container, false);

        ArrayList<Integer> back = new ArrayList<>(Arrays.asList(R.drawable.back1, R.drawable.back2, R.drawable.back3, R.drawable.back4, R.drawable.back5, R.drawable.back6));
        ArrayList<Integer> ic = new ArrayList<>(Arrays.asList(R.drawable.ic_user1,R.drawable.ic_user2,R.drawable.ic_user3,R.drawable.ic_user4, R.drawable.ic_user5,R.drawable.ic_user6));
        ArrayList<String> name = new ArrayList<>(Arrays.asList("User Settings","My Store’s Location","My Post Distance Setting","Terms and Policies","Help","Logout"));

        ProfileAdapter pAdapter;
        recyclerView=view.findViewById(R.id.reView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        pAdapter=new ProfileAdapter(getContext(), back, ic, name);
        recyclerView.setAdapter(pAdapter);



        return view;
    }
}