package com.company.players;

public class Medic extends Hero {

    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, SuperAbility.HEAL);
         this.healPoints = healPoints;

    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
