import java.util.Scanner;

public class TokoBangunanRico {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Banyak belanjaan: ");
        int jmlBarang = inp.nextInt();
        int hargabarang = 0;
        double totalBayar = 0;
        double diskon = 0;
        String besaranDiskon;

        for (int i=1;i<=jmlBarang;i++){
            System.out.print("Harga barang ke-"+i+": ");
            hargabarang += inp.nextInt();
        }
        if (hargabarang >= 101000 && hargabarang<= 200000){
            diskon = hargabarang*5/100;
            besaranDiskon = "5%";
        }
        else if (hargabarang >= 201000 && hargabarang<=400000){
            diskon = hargabarang*10/100;
            besaranDiskon = "10%";
        }
        else if (hargabarang > 400000){
            diskon = hargabarang*20/100;
            besaranDiskon = "20%";
        }
        else{
            diskon = hargabarang*1;
            besaranDiskon = "gaada diskon bang!";
        }

        totalBayar = hargabarang-diskon;
        System.out.println("Total harga : "+hargabarang);
        System.out.println("Diskon : "+besaranDiskon);
        System.out.println("Total Bayar : "+totalBayar);
    }
}
