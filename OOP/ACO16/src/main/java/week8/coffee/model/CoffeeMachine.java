package week8.coffee.model;

/**
 * Created by gorobec on 26.11.16.
 */
public class CoffeeMachine implements State{

    private State noMoneyState;
    private State noChoiceState;
    private State inProcessState;
    private State outOfOrderState;

    private State currentState;

    int portionsOfCoffee = 3;


    public CoffeeMachine(){

        noMoneyState = new NoMoneyState(this);
        noChoiceState = new NoChoiceState(this);
        inProcessState = new InProcessState(this);
        outOfOrderState = new OutOfOrderState(this);

        currentState = noMoneyState;

    }


    @Override
    public void putMoney() {
        currentState.putMoney();
    }

    @Override
    public void makeChoice() {
        currentState.makeChoice();
    }

    @Override
    public void makeCoffee() {
        currentState.makeCoffee();
    }

    @Override
    public void giveCharge() {
        currentState.giveCharge();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getNoChoiceState() {
        return noChoiceState;
    }

    public State getInProcessState() {
        return inProcessState;
    }

    public State getOutOfOrderState() {
        return outOfOrderState;
    }
}
