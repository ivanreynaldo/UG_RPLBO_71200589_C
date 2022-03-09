package com.ug5a.soal1;

public class TransPay {
    String nama;
    Long saldo;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Long getSaldo() {
        return saldo;
    }

    public void setSaldo(Long saldo) {
        this.saldo = saldo;
    }

    public void topUp(long topUp) {
       if (topUp>0){
           System.out.println("Top up sebesar Rp "+topUp+" berhasil");
           saldo = saldo+topUp;
       }
       else {
           System.out.println("Nominal Anda tidak valid! Nomilal harus lebih dari 0");
       }
    }

    public void bayar(int jumlah, Keyboard k) {
        k.getHarga();
        k.getMerkModel();
        long total = jumlah * k.harga;
        if(jumlah>0){
            if (saldo< total){
                System.out.println("Pembayaran gagal! Saldo Anda kurang, silahkan melakukan yop up");
                return;
            }
            else {
                System.out.println("Pembayaran sukses! Silahkan mengambil "+k.merkModel+" di counter");
                saldo = saldo-(total);
            }

        }
        else {
            System.out.println("Input jumlah tidak valid!");
        }

    }
}
