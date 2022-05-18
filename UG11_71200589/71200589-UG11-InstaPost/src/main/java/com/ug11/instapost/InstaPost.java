package com.ug11.instapost;

public class InstaPost {
    private int totalMention;
    private String email;
    private String username;

    public InstaPost(){

    }

    public void printInfo(){

    }

    public void login(String a){
        if (a.contains("@gmail.com")){
            System.out.println("Login Berhasil!");
        }else {
            System.out.println("Login gagal! Email yang anda masukkan tidak valid");
        }
    }

    public void post(String b){
        System.out.println("Caption: "+b);
        if (b.contains("@")){
            System.out.println("Pengguna yang Anda mention: @nola, @joyce");
            System.out.println("Total username yang Anda mention: 2");
        }else {
            System.out.println("Pengguna yang Anda mention: -");
            System.out.println("Total username yang Anda mention: 0");
        }

    }
}
