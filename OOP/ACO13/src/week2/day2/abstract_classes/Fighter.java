package week2.day2.abstract_classes;

/**
 * Created by gorobec on 29.05.16.
 */
public abstract class Fighter {
    public int health = 100;
    private String name;
    public int damage;

    public Fighter(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void hit(Fighter fighter);

    public String asString() {
        return name;
    }
}
