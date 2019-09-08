package com.company;

public class Magical extends Player {
    private int magicalSuperPower;

    public int getMagicalSuperPower() {
        return magicalSuperPower;
    }

    public void setMagicalSuperPower(int magicalSuperPower) {
        this.magicalSuperPower = magicalSuperPower;
    }

    public Magical(int playerHealth, double playerDamage) {
        super(playerHealth, playerDamage);
    }
}
