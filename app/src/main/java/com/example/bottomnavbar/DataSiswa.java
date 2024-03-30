package com.example.bottomnavbar;
public class DataSiswa {

    String Nama;
    String NoAbsen;
    String ProfileUrl; // Add field for profile image URL

    public String getNama() {
        return Nama;
    }

    public String getNoAbsen() {
        return "No. Absen: " + NoAbsen;
    }

    public String getProfileUrl() {
        return ProfileUrl;
    }

    public DataSiswa(String nama, String noAbsen, String profileUrl) {
        Nama = nama;
        NoAbsen = noAbsen;
        ProfileUrl = profileUrl;
    }
}
