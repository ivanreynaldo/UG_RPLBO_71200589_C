package org.example;

public abstract class Character implements ObjectAttack{
    public Character(String N, int D, int H) {

    }
    protected int damage;
    protected String name;
    protected int health;

    public void showCharacterInfo(){

    }
    public boolean isDie(){
        return false;
    }
    public abstract void attacked(int a);
}
