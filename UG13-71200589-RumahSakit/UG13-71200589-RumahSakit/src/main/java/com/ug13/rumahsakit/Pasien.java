package com.ug13.rumahsakit;

public class Pasien {
    String nama;
    int usia;
    String alamat;
    String penyakit;
    int levelPenyakit;
    String status;

    public Pasien(String nama, int usia, String alamat) {
        nama = this.nama;
        usia = this.usia;
        alamat = this.alamat;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }
}
