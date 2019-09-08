package com.company;

public class Mental extends Player {
    private int mentalSuperPower;

    public int getMentalSuperPower() {
        return mentalSuperPower;
    }

    public void setMentalSuperPower(int mentalSuperPower) {
        this.mentalSuperPower = mentalSuperPower;
    }

    public Mental(int playerHealth, double playerDamage) {
        super(playerHealth, playerDamage);
    }
}
