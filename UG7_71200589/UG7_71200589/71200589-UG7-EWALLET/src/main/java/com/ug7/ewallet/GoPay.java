package com.ug7.ewallet;

import java.util.Scanner;

public class GoPay extends eWallet{
    private int feeTopup = 1000;
    private int feeTransfer = 500;
    private int feeWithdraw = 2500;

    public GoPay(User user) {
        super(user);
    }

    public void topup(int jumlah) {
        if (jumlah < 10000) {
            System.out.println("Minimal top up Rp.10.000");
        }
        else if (jumlah + this.feeTopup > super.getUser().getUang()) {
            jumlah += this.feeTopup;
            System.out.println("Maaf, uang cash kamu tidak mencukupi! (" + Main.formatRupiah(this.getSaldo() - jumlah) + ")");
        }
        else {
            super.topup(jumlah);
            this.bayar(this.feeTopup);
        }
    }

    public void transfer(eWallet eWallet, int jumlah) {
        System.out.print("Masukkan PIN anda: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        System.out.print("Validasi PIN");
        Main.tunggu(3);
        if (!password.equals(this.getUser().getPIN())) {
            System.out.println("Maaf, PIN yang kamu masukkan salah!");
        }
        else {
            System.out.println("Transfer saldo akan terkena potongan fee " + Main.formatRupiah(this.feeTransfer));
            System.out.print("Transfer sedang diproses");
            Main.tunggu(3);
            if (jumlah + this.feeTransfer > super.getSaldo()) {
                jumlah += this.feeTransfer;
                System.out.println("Maaf, saldo kamu tidak mencukupi! (" + Main.formatRupiah(this.getSaldo() - jumlah) + ")");
            } else {
                super.transfer(eWallet, jumlah);
                this.bayar(this.feeTransfer);
            }
        }
    }

    public void getInfo() {
        System.out.println("[GoPay e-Wallet]");
        super.getInfo();
    }

    public void withdraw(int jumlah) {
        System.out.println("Withdraw saldo akan terkena potongan fee " + Main.formatRupiah(this.feeWithdraw));
        if (jumlah + this.feeWithdraw > super.getSaldo()) {
            jumlah += this.feeWithdraw;
            System.out.println("Maaf, saldo kamu tidak mencukupi! (" + Main.formatRupiah(this.getSaldo() - jumlah) + ")");
        } else {
            super.withdraw(jumlah);
            this.bayar(this.feeWithdraw);
        }
    }



}