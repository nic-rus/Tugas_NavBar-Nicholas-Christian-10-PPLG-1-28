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

public class Fragment1_trapesium extends Fragment {

    Button backButton;
    Button calcButton;
    EditText aField;
    EditText bField;
    EditText TinggiField;
    TextView Hasil;

    public Fragment1_trapesium() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment1_trapesium, container, false);

        // Initialize the backButton
        backButton = rootView.findViewById(R.id.btn_back);

        // Set click listener for the backButton
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadFragment(new Fragment1());
            }
        });

        aField = rootView.findViewById(R.id.input_a);
        bField = rootView.findViewById(R.id.input_b);
        TinggiField = rootView.findViewById(R.id.input_tinggi);
        Hasil = rootView.findViewById(R.id.txt_hasil);

        // Initialize the backButton
        calcButton = rootView.findViewById(R.id.button_calculate);

        // Set click listener for the backButton
        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!aField.getText().toString().isEmpty() && !bField.getText().toString().isEmpty() && !TinggiField.getText().toString().isEmpty()) {
                    Toast.makeText(requireContext(), "Luas telah dihitung!", Toast.LENGTH_SHORT).show();
                    int InputA = Integer.parseInt(aField.getText().toString());
                    int InputB = Integer.parseInt(bField.getText().toString());
                    int InputTinggi = Integer.parseInt(TinggiField.getText().toString());
                    int hasil = ((InputA + InputB) *  InputTinggi) / 2;
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
