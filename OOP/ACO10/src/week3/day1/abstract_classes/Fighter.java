package week3.day1.abstract_classes;

public abstract class Fighter {
    protected String name;
    protected int health;
    protected int maxDamage;

    public int getHealth() {
        return health;
    }

    public Fighter(String name, int health, int maxDamage) {
        this.name = name;
        this.health = health;
        this.maxDamage = maxDamage;
    }

    public abstract void hit(Fighter enemy);

  /*  private int getMaxDamage() {
        int damage = (int)(Math.random() * maxDamage);
        System.out.printf("Fighter - %s, hit with damage - %d\n", name, damage);
        return damage;
    }
*/
    public String toString(){
        return String.format("Fighter - %s, " +
                "health - %d, maxDamage - %d", name, health, maxDamage);
    }
}
