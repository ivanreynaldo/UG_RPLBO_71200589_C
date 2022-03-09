package com.ug5a.soal2;

public class App {
    public static void infoSepatu(Sepatu shoes){
        shoes.getHarga();
        shoes.getKode();
        shoes.getMerkModel();
        shoes.getUkuran();
        shoes.getStok();

        System.out.println("-----"+shoes.merkModel+"-----");
        System.out.println("Kode: "+shoes.kode);
        System.out.println("Ukuran: "+shoes.ukuran);
        System.out.println("Harga: "+shoes.harga);
        System.out.println("Stok: "+shoes.stok);
    }
    public static void main( String[] args ) {
        Sepatu nikeA = new Sepatu("Nike Air Jordan 1 High OG",40,3500000,5);
        Sepatu nikeB = new Sepatu("Nike Blazer",38,750000,10);
        Sepatu nikeC = new Sepatu("Nike SB Dunk Low J-Pack Shadow",36,1300000,2);
        System.out.println("\n========== Daftar Sepatu Nike==========\n");
        infoSepatu(nikeA);
        infoSepatu(nikeB);
        infoSepatu(nikeC);
    }

}
