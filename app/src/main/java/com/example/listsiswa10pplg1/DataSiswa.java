package com.example.listsiswa10pplg1;

import android.graphics.drawable.Drawable;

public class DataSiswa {

    String Nama;
    int NoAbsen;
    int Profile;

    public String getNama() {
        return Nama;
    }

    public int getNoAbsen() {
        return NoAbsen;
    }

    public int getProfile() {
        return Profile;
    }

    public DataSiswa(String nama, int noAbsen, int profile) {
        Nama = nama;
        NoAbsen = noAbsen;
        Profile = profile;
    }
}
