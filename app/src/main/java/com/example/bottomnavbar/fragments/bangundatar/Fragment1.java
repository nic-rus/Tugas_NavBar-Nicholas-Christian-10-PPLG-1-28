package com.example.bottomnavbar.fragments.bangundatar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.bottomnavbar.R;

public class Fragment1 extends Fragment {

    ImageView persegiImg;
    TextView persegiTxt;
    ImageView segitigaImg;
    TextView segitigaTxt;
    ImageView lingkaranImg;
    TextView lingkaranTxt;
    ImageView trapesiumImg;
    TextView trapesiumTxt;
    public Fragment1(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment1, container, false);

        // Initialize the backButton
        persegiImg = rootView.findViewById(R.id.persegi_img);

        // Initialize the backButton
        persegiTxt = rootView.findViewById(R.id.persegi_txt);

        // Set click listener for the backButton
        persegiImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment1_persegi());
            }
        });

        persegiTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment1_persegi());
            }
        });

        // Initialize the backButton
        segitigaImg = rootView.findViewById(R.id.segitiga_img);

        // Initialize the backButton
        segitigaTxt = rootView.findViewById(R.id.segitiga_txt);

        // Set click listener for the backButton
        segitigaImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment1_segitiga());
            }
        });

        segitigaTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment1_segitiga());
            }
        });

        // Initialize the backButton
        lingkaranImg = rootView.findViewById(R.id.lingkaran_img);

        // Initialize the backButton
        lingkaranTxt = rootView.findViewById(R.id.lingkaran_txt);

        // Set click listener for the backButton
        lingkaranImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment1_lingkaran());
            }
        });

        lingkaranTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment1_lingkaran());
            }
        });


        // Initialize the backButton
        trapesiumImg = rootView.findViewById(R.id.trapesium_img);

        // Initialize the backButton
        trapesiumTxt = rootView.findViewById(R.id.trapesium_txt);

        // Set click listener for the backButton
        trapesiumImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment1_trapesium());
            }
        });

        trapesiumTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment1_trapesium());
            }
        });

        return rootView;
    }

    public void LoadFragment(Fragment selectedFragment)
    {
        FragmentManager manager = getParentFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame, selectedFragment);
        transaction.commit();
    }
}
