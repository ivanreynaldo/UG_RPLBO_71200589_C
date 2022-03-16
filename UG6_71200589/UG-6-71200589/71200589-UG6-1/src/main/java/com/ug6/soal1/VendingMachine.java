package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachine {
    private String code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<Double> acceptanceBalance;
    private double consumerMoney;

    public VendingMachine(){

    }

    public VendingMachine(String code,int capacity){
        this.capacity = capacity;
        this.code = code;

    }

    public VendingMachine(String code,int capacity,Goods goods,double[] acceptanceBalance){
        this.code = code;
        this.capacity = capacity;


    }

    public void proceedOrder(String goodsCode,int orderQuantity){

    }

    public void takeMoney(double money){

    }

    private void giveGood(double goodsPrice,String Name){

    }

    public double withdrawMoney(){
        return 0;
    }

    public void inputGoods(Goods good){

    }
}
