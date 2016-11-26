package week8.coffee.model;

/**
 * Created by gorobec on 26.11.16.
 */
public class OutOfOrderState implements State {

    private CoffeeMachine coffeeMachine;

    public OutOfOrderState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void putMoney() {
        System.out.println("Sorry out of order");
    }

    @Override
    public void makeChoice() {
        System.out.println("Sorry out of order");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Sorry out of order");
    }

    @Override
    public void giveCharge() {
        System.out.println("Sorry out of order");
    }
}
