package com.company;

public class Warrior extends Player implements SuperAbility {
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


    @Override
    public void superability() { System.out.println("Воин применил суперспособность"); }
}
