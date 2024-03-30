package com.example.bottomnavbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.bottomnavbar.fragments.bangundatar.Fragment1;
import com.example.bottomnavbar.fragments.bangunruang.Fragment2;
import com.example.bottomnavbar.fragments.Fragment3;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvListDataSiswa;
    List<DataSiswa> KumpulanDataSiswa;
    RecyclerViewAdapter adapter;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navbar);
        bottomNavigationView.setOnItemSelectedListener(navListener);

        // Load the default fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame, new Fragment1())
                .commit();

        /*
        rvListDataSiswa = findViewById(R.id.rvListData);


        KumpulanDataSiswa = new ArrayList<>();
        KumpulanDataSiswa.add(new DataSiswa("Aldi", "1", "https://external-preview.redd.it/XY-o7ej1sEP7xUKC3FW-opsx_7K8uafBkJ41_8fm69A.jpg?auto=webp&s=fe1fa642cbfa027565d237e090179ecf4a2a041b"));
        KumpulanDataSiswa.add(new DataSiswa("Lisa", "2", "https://i.pinimg.com/originals/95/fe/aa/95feaa7c57c9af1c9f6bb762fc08bfe9.jpg"));
        KumpulanDataSiswa.add(new DataSiswa("Edo", "3", "https://th.bing.com/th/id/OIP.RNcWEeV9dw2_nHPIWCtgTgHaHa?w=500&h=500&rs=1&pid=ImgDetMain"));
        KumpulanDataSiswa.add(new DataSiswa("Diana", "4", "https://th.bing.com/th/id/R.4efa91a3a3d969b1a2cbb95d63889fbe?rik=wnIBvu2dXVvkkQ&riu=http%3a%2f%2f3.bp.blogspot.com%2f-BB-IfCSfnK4%2fUdWAYzfQwDI%2fAAAAAAAAFSY%2fywMjU8eaDT8%2fs1600%2fphoto%2b%25252822%252529.JPG&ehk=vNYfopncsaTl2t%2b9fGRRLFTzUgMdCloXAQ8yxRcrgoA%3d&risl=&pid=ImgRaw&r=0"));
        KumpulanDataSiswa.add(new DataSiswa("Tono", "5", "https://th.bing.com/th/id/OIP.QHwjdcpT3Jwyl2mAKtJ80AAAAA?w=474&h=527&rs=1&pid=ImgDetMain"));
        KumpulanDataSiswa.add(new DataSiswa("Aji", "6", "https://2.bp.blogspot.com/-7iOl4-5vN_s/WRkuxYxJN4I/AAAAAAAAHh8/CEDaiVPptYMRH3ZQFB0P8g8hr70jDPIFgCLcB/s1600/how-to-celebrate-a-pets-birthday.jpg"));
        KumpulanDataSiswa.add(new DataSiswa("Doni", "7", "https://th.bing.com/th/id/OIP.Fm7Mpw_dnCfcy3_GMdZG5AHaHa?rs=1&pid=ImgDetMain"));
        KumpulanDataSiswa.add(new DataSiswa("Afdhal", "8", "https://th.bing.com/th/id/OIP.fNGqbw4sojc6WPbd-KXD8gAAAA?w=474&h=474&rs=1&pid=ImgDetMain"));
        KumpulanDataSiswa.add(new DataSiswa("Zain", "9", "https://i.pinimg.com/originals/61/d0/fe/61d0fed60f1074823534f3c110c9cc6c.jpg"));
        KumpulanDataSiswa.add(new DataSiswa("Samuel", "10", "https://th.bing.com/th/id/OIP.gb0bbeJhPjAx4S7DLvO9MQHaHI?rs=1&pid=ImgDetMain"));
        KumpulanDataSiswa.add(new DataSiswa("Fikri", "11", "https://th.bing.com/th/id/OIP.w1LArMluets6sF1WZUqdhQHaHx?w=2814&h=2955&rs=1&pid=ImgDetMain"));
        KumpulanDataSiswa.add(new DataSiswa("Michael", "12", "https://i.pinimg.com/originals/ef/0a/20/ef0a20bcc9cdcd08e97106b1663d9a87.jpg"));
        KumpulanDataSiswa.add(new DataSiswa("Jojo", "13", "https://th.bing.com/th/id/OIP._qF6WTKcfoOdpaBZNgeIvQHaH8?w=557&h=598&rs=1&pid=ImgDetMain"));
        KumpulanDataSiswa.add(new DataSiswa("Hatta", "14", "https://th.bing.com/th/id/OIP.SH_jBU121LS4OMyz_jPuhgAAAA?w=474&h=470&rs=1&pid=ImgDetMain"));
        KumpulanDataSiswa.add(new DataSiswa("Eddy", "15", "https://thumbs.dreamstime.com/b/cute-cat-portrait-square-photo-beautiful-white-closeup-105311158.jpg"));
        KumpulanDataSiswa.add(new DataSiswa("Farhan", "16", "https://th.bing.com/th/id/OIP.FObi5TvKUXiXba1cfM9HLgHaHa?w=640&h=640&rs=1&pid=ImgDetMain"));


        // call adapter data
        rvListDataSiswa.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(this, KumpulanDataSiswa);
        rvListDataSiswa.setAdapter(adapter);

        // Set click listener for RecyclerView items
        adapter.setClickListener(new RecyclerViewAdapter.ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                DataSiswa clickedItem = KumpulanDataSiswa.get(position);
                String message = clickedItem.getNama() + ", "+ clickedItem.getNoAbsen();
                showToast(message);
            }
        });
    }

    // Method to show toast message
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
         */
    }

    private BottomNavigationView.OnItemSelectedListener navListener =
            new BottomNavigationView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    if (item.getItemId() == R.id.menu_item1) {
                        selectedFragment = new Fragment1();
                    } else if (item.getItemId() == R.id.menu_item2) {
                        selectedFragment = new Fragment2();
                    } else if (item.getItemId() == R.id.menu_item3) {
                        selectedFragment = new Fragment3();
                    }

                    LoadFragment(selectedFragment);

                    return true;
                }
            };

    public void LoadFragment(Fragment selectedFragment)
    {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame, selectedFragment);
        transaction.commit();
    }
}
