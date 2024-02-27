package com.example.listsiswa10pplg1;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DataSiswa> KumpulanDataSiswa;

    RecyclerView RVlistSiswa;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KumpulanDataSiswa = new ArrayList<>();
        KumpulanDataSiswa.add(new DataSiswa("Aldi", 2, R.drawable.avatar_boy));
        KumpulanDataSiswa.add(new DataSiswa("Lisa", 3, R.drawable.avatar_girl));
        KumpulanDataSiswa.add(new DataSiswa("Edo", 4, R.drawable.avatar_boy));
        KumpulanDataSiswa.add(new DataSiswa("Diana", 5, R.drawable.avatar_girl));

        RVlistSiswa = findViewById(R.id.rvListData);
        RVlistSiswa.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(this, KumpulanDataSiswa);
        RVlistSiswa.setAdapter(adapter);
    }
}