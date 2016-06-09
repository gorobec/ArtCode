package week3.day1.abstract_classes;

import week3.day1.abstract_classes.Fighter;

public class Subzero extends Fighter {

private static final int FREEZE = 15;
    public Subzero(String name, int health, int maxDamage) {
        super(name, health, maxDamage);
    }

    @Override
    public void hit(Fighter enemy) {
        enemy.health -= genDamage();
    }

    private int genDamage() {
        int damage = FREEZE + (int)(Math.random() * maxDamage);
        System.out.printf("Fighter - %s, damage - %d\n", name, damage);
        return damage;
    }
}
