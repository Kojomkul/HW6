package com.company;

public class Warrior extends Player {
    private int warriorSuperPower;

    public int getWarriorSuperPower() {
        return warriorSuperPower;
    }

    public void setWarriorSuperPower(int warriorSuperPower) {
        this.warriorSuperPower = warriorSuperPower;
    }

    public Warrior(int playerHealth, double playerDamage) {
        super(playerHealth, playerDamage);
    }
}
