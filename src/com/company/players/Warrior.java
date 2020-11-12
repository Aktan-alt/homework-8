package com.company.players;

import java.util.Random;

public class Warrior extends Hero {


    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRIRICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

        Random warr = new Random();
        int x = warr.nextInt(5) + 2;
        this.setDamage(getDamage() * x);
        System.out.println(this.getDamage());
    }
}
