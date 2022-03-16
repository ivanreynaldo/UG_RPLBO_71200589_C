package com.ug6.soal1;

public class Codes {
    private String GOODSCODES;
    private String VENDINGMACHINESCODE;
    private String[] TYPE;

    public String generateGoodsCode(String TYPE,String name){
        GOODSCODES = "GD";
        String makanan = "FD";
        String minuman = "DR";
        String barangDigital = "DG";
        String code = null;
        if (TYPE == "Makanan"){
            code = (GOODSCODES+makanan+name);
        }
        if (TYPE == "Minuman"){
            code = (GOODSCODES+minuman+name);
        }
        if (TYPE == "Barang Digital"){
            code = (GOODSCODES+barangDigital+name);
        }
        return code;
    }

    public String generateVendingMachinesCode(int order){
        VENDINGMACHINESCODE = "VD";
        int urutan = 0;
        String code = VENDINGMACHINESCODE+urutan;
        urutan += 1;
        return code;
    }
}
