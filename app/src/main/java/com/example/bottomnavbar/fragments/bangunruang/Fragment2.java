package com.example.bottomnavbar.fragments.bangunruang;

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

public class Fragment2 extends Fragment {

    ImageView kubusImg;
    TextView kubusTxt;
    ImageView prismaImg;
    TextView prismaTxt;
    ImageView bolaImg;
    TextView bolaTxt;
    ImageView balokImg;
    TextView balokTxt;
    public Fragment2(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment2, container, false);

        // Initialize the backButton
        kubusImg = rootView.findViewById(R.id.kubus_img);

        // Initialize the backButton
        kubusTxt = rootView.findViewById(R.id.kubus_txt);

        // Set click listener for the backButton
        kubusImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment2_kubus());
            }
        });

        kubusTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment2_kubus());
            }
        });

        // Initialize the backButton
        prismaImg = rootView.findViewById(R.id.prisma_img);

        // Initialize the backButton
        prismaTxt = rootView.findViewById(R.id.prisma_txt);

        // Set click listener for the backButton
        prismaImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment2_prisma());
            }
        });

        prismaTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment2_prisma());
            }
        });

        // Initialize the backButton
        bolaImg = rootView.findViewById(R.id.bola_img);

        // Initialize the backButton
        bolaTxt = rootView.findViewById(R.id.bola_txt);

        // Set click listener for the backButton
        bolaImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment2_bola());
            }
        });

        bolaTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment2_bola());
            }
        });


        // Initialize the backButton
        balokImg = rootView.findViewById(R.id.balok_img);

        // Initialize the backButton
        balokTxt = rootView.findViewById(R.id.balok_txt);

        // Set click listener for the backButton
        balokImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment2_balok());
            }
        });

        balokTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment2_balok());
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
