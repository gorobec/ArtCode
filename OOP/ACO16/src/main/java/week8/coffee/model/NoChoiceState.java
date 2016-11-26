package week8.coffee.model;

/**
 * Created by gorobec on 26.11.16.
 */
public class NoChoiceState implements State {

    private CoffeeMachine coffeeMachine;

    public NoChoiceState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void putMoney() {
        System.out.println("You've already put money");
        System.out.println("Make your choice");
    }

    @Override
    public void makeChoice() {
        System.out.println("Nice choice");
        coffeeMachine.setCurrentState(coffeeMachine.getInProcessState());
    }

    @Override
    public void makeCoffee() {
        System.out.println("First make your choice");
    }

    @Override
    public void giveCharge() {
        System.out.println("Have a nice day!");
        coffeeMachine.setCurrentState(coffeeMachine.getNoMoneyState());
    }
}
