package week8.coffee.model;

/**
 * Created by gorobec on 26.11.16.
 */
public class InProcessState implements State {

    private CoffeeMachine coffeeMachine;

    public InProcessState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void putMoney() {
        System.out.println("You've already put money");
        System.out.println("Push start or cancel");
    }

    @Override
    public void makeChoice() {
        System.out.println("You've make choice");
        System.out.println("Push start or cancel");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Making coffee ...");
        coffeeMachine.portionsOfCoffee--;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Take your coffee, please");
        if(coffeeMachine.portionsOfCoffee > 0)
            coffeeMachine.setCurrentState(coffeeMachine.getNoMoneyState());
        else
            coffeeMachine.setCurrentState(coffeeMachine.getOutOfOrderState());
    }

    @Override
    public void giveCharge() {
        System.out.println("Have a nice day!");
        coffeeMachine.setCurrentState(coffeeMachine.getNoMoneyState());
    }
}
