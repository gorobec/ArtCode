package week8.coffee;

import week8.coffee.model.CoffeeMachine;

/**
 * Created by gorobec on 26.11.16.
 */
public class RunCoffeeMachine {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.putMoney();
        coffeeMachine.makeChoice();
        coffeeMachine.makeCoffee();

        coffeeMachine.putMoney();
        coffeeMachine.makeChoice();
        coffeeMachine.makeCoffee();

        coffeeMachine.putMoney();
        coffeeMachine.makeChoice();
        coffeeMachine.makeCoffee();

        coffeeMachine.putMoney();
        coffeeMachine.makeChoice();
        coffeeMachine.makeCoffee();
    }
}
