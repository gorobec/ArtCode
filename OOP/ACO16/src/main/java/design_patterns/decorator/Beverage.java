package design_patterns.decorator;

/**
 * Created by gorobec on 06.11.16.
 */
public class Beverage {
    protected String name;
    protected double price;

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
