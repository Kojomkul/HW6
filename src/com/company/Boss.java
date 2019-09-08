package com.company;

public class Boss extends Player {
    private int bossDefense;

    public Boss(int playerHealth, double playerDamage) {
        super(playerHealth, playerDamage);
    }

    public int getBossDefense() {
        return bossDefense;
    }

    public void setBossDefense(int bossDefense) {
        this.bossDefense = bossDefense;
    }
}
