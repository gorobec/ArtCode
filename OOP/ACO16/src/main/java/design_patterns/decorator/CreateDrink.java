package design_patterns.decorator;

/**
 * Created by gorobec on 06.11.16.
 */
public class CreateDrink {
    public static void main(String[] args) {


        Beverage beverage = new Milk("Milk", 3.0, new Sugar("Sugar", 0.25, new Espresso("Epresso", 10.50)));
        Beverage beverage2 = new Milk("Milk", 3.0, new Chocolate("Chocolate", 4.10, new Sugar("Sugar", 0.25, new BlackCoffee("BlackCoffee", 12.50))));

        System.out.println(beverage.getName() + " = " + beverage.getPrice());
        System.out.println(beverage2.getName() + " = " + beverage2.getPrice());
    }
}
