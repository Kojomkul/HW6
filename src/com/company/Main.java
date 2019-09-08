package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(1000, 50);
        boss.setBossDefense(25);

        Warrior warrior = new Warrior(800, 40);
        warrior.setWarriorSuperPower(20);

        Magical magical = new Magical(700, 35);
        magical.setMagicalSuperPower(25);

        Mental mental = new Mental(600, 30);
        mental.setMentalSuperPower(30);
    }
}
