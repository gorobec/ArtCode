package design_patterns.decorator;

/**
 * Created by gorobec on 06.11.16.
 */
public class BeverageCondiment extends Beverage{


    protected Beverage beverage;


    public BeverageCondiment(String name, double price, Beverage beverage) {
        super(name, price);
        this.beverage = beverage;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public String getName(){
        return super.getName();
    }
}
