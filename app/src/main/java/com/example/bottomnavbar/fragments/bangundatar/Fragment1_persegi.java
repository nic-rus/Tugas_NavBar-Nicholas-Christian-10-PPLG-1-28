package com.example.bottomnavbar.fragments.bangundatar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.bottomnavbar.R;

public class Fragment1_persegi extends Fragment {

    Button backButton;
    Button calcButton;
    EditText SisiField;
    TextView Hasil;

    public Fragment1_persegi() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment1_persegi, container, false);

        // Initialize the backButton
        backButton = rootView.findViewById(R.id.btn_back);

        // Set click listener for the backButton
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment1());
            }
        });

        SisiField = rootView.findViewById(R.id.input_sisi);
        Hasil = rootView.findViewById(R.id.txt_hasil);

        // Initialize the backButton
        calcButton = rootView.findViewById(R.id.button_calculate);

        // Set click listener for the backButton
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!SisiField.getText().toString().isEmpty()) {
                    Toast.makeText(requireContext(), "Luas telah dihitung!", Toast.LENGTH_SHORT).show();
                    int InputSisi = Integer.parseInt(SisiField.getText().toString());
                    int hasil = InputSisi * InputSisi;
                    Hasil.setText(String.valueOf(hasil) + "cm²");
                }else
                {
                    Toast.makeText(requireContext(), "Kolom tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
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
