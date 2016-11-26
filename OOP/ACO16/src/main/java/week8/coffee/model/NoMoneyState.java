package week8.coffee.model;

/**
 * Created by gorobec on 26.11.16.
 */
public class NoMoneyState implements State {

    private CoffeeMachine coffeeMachine;

    public NoMoneyState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void putMoney() {
        System.out.println("Thank you for money");
        System.out.println("Make your choice");
        coffeeMachine.setCurrentState(coffeeMachine.getNoChoiceState());
    }

    @Override
    public void makeChoice() {
        System.out.println("First put money in");

    }

    @Override
    public void makeCoffee() {
        System.out.println("First put money in");
    }

    @Override
    public void giveCharge() {
        System.out.println("Nice try ))");
        System.out.println("First put money in");
    }
}
