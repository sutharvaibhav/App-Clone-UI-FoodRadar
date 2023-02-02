package com.latlng.foodradar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Feed extends AppCompatActivity {

    ImageView Feed;
    ImageView Msg;
    ImageView Pro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);



        Feed = findViewById(R.id.feed);
        Msg = findViewById(R.id.message);
        Pro = findViewById(R.id.profile);

        Feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replaceFragment(new FeedsFragment());

            }
        });

        Msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            replaceFragment(new MessageFragment());
            }
        });

        Pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replaceFragment(new ProfileFragment());
            }
        });


    }

    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameFeed,fragment);
        fragmentTransaction.commit();

    }
}