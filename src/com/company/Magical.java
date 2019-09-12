package com.company;

public class Magical extends Player implements SuperAbility {
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

    @Override
    public void superability() { System.out.println("Маг применил суперспособность"); }
}
