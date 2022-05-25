package com.ug12.projectkassa;

import java.util.ArrayList;
import java.util.HashMap;

public class Kassa {
    private HashMap<Produk, Integer> pesanan;
    private ArrayList<Kasir> arrKasir;
    private Kasir kasir;

    public Kassa() {

    }

    public void login(String username,String password){

        System.out.println("Login Berhasil");
    }

    public void register(Kasir namaKasir){
        //arrKasir.add(namaKasir);
        System.out.println("Kasir "+namaKasir.getNama()+" berhasil ditambahkan ke dalam sistem");
    }

    public void tambahPesanan(Produk a, int b){

    }

    public void printNota(){

    }

    public void printPenjualanKasir(){

    }
}
