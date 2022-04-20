package org.example;

public abstract class MagicCharacter extends Character{
    public MagicCharacter(String N, int D, int H, int M) {
        super(N, D, H);
    }

    protected int mana;

    public void attacked(int a) {

    }

    public void showCharacterInfo() {
        super.showCharacterInfo();
    }
}
