package week4.final_word;

public final class NuclearStation {
    private final int criticalTemperature = 1550;
    private final int powerLimit;

    public NuclearStation(int criticalTemperature, int powerLimit) {
//        this.criticalTemperature = criticalTemperature;
        this.powerLimit = powerLimit;
    }

    public int getCriticalTemperature() {
        return criticalTemperature;
    }


    public int getPowerLimit() {
        return powerLimit;
    }


    public final void start(int temperature, int power){
        if(temperature >= criticalTemperature){
            System.out.println("The temp is critical");
            return;
        } else if (power < powerLimit) {
            System.out.println("Not enough energy");
            return;
        } else {
            System.out.println("Start working");
        }
    }
}
