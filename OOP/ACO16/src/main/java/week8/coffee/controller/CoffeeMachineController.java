package week8.coffee.controller;

import week8.coffee.model.CoffeeMachine;
import week8.coffee.view.CoffeMachineFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gorobec on 26.11.16.
 */
public class CoffeeMachineController {

    private CoffeMachineFrame coffeMachineFrame;
    private CoffeeMachine coffeeMachine;

    public CoffeeMachineController(CoffeMachineFrame coffeMachineFrame, CoffeeMachine coffeeMachine) {
        this.coffeMachineFrame = coffeMachineFrame;
        this.coffeeMachine = coffeeMachine;

        coffeMachineFrame.addPutMoneyListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeMachine.putMoney();
            }
        });

        coffeMachineFrame.addMakeChoiceListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeMachine.makeChoice();
            }
        });

        coffeMachineFrame.addMakeCoffeeListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeMachine.makeCoffee();
            }
        });

        coffeMachineFrame.addGiveChargeListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeMachine.giveCharge();
            }
        });

        coffeMachineFrame.setVisible(true);

    }
}
