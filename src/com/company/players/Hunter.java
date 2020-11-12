package com.company.players;

import java.util.Random;

public class Hunter extends Hero {


    public Hunter(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int savedamageAndRevert = r.nextInt(15) + 6;
        boss.setHealth(boss.getHealth() - savedamageAndRevert);
        this.setHealth(this.getHealth() + savedamageAndRevert);
        System.out.println("Hunter saved and reverted " + savedamageAndRevert);

        }
    }
