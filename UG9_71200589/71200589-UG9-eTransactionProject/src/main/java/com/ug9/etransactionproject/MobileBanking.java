package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment{
    private boolean checkFee;
    private long feeAntarBank;
    private String noRekening;

    public MobileBanking(String ,long b,String c){
        super();

    }

    public String getNoRekening() {
        return noRekening;
    }

    public void transfer(DigitalPayment penerima, long nomilan){

    }

    public boolean isCheckFee(){
        return false;
    }

    public void setCheckFee(boolean fee){

    }
}
