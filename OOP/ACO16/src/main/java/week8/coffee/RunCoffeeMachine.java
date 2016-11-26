package week8.coffee;

import week8.coffee.controller.CoffeeMachineController;
import week8.coffee.model.CoffeeMachine;
import week8.coffee.view.CoffeMachineFrame;

/**
 * Created by gorobec on 26.11.16.
 */
public class RunCoffeeMachine {
    public static void main(String[] args) {
        CoffeMachineFrame frame = new CoffeMachineFrame();
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        CoffeeMachineController controller = new CoffeeMachineController(frame, coffeeMachine);
    }
}
