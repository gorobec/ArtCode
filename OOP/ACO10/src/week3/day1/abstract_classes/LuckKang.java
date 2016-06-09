package week3.day1.abstract_classes;


public class LuckKang extends Fighter{
    private static final int SPEED = 3;
    private int manna;
    public LuckKang(String name, int health, int maxDamage, int manna) {
        super(name, health, maxDamage);
        this.manna = manna;
    }

    @Override
    public void hit(Fighter enemy) {
        enemy.health -= genDamage();
    }

    private int genDamage() {
        int damage = SPEED + (int)(Math.random() * maxDamage) + (manna * 2);
        System.out.printf("Fighter - %s, damage - %d\n", name, damage);
        return damage;
    }
}
