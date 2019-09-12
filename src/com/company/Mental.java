package com.company;

public class Mental extends Player implements SuperAbility {
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

    @Override
    public void superability() { System.out.println("Ментал применил суперспособность"); }
}
