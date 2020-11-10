package com.company.players;

public class Warrior extends Hero {


    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRIRICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
