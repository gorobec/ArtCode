package week5.nested_classes;

/**
 * Created by gorobec on 05.11.16.
 */
public class Ship {

    String name = "Ship";

    Engine engine;

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }

    public static class LifeBoat{
        private String name;

        public LifeBoat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "LifeBoat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public class Engine{


        private String name;

        public Engine(String name) {
            this.name = name;
            Ship.this.engine = this;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "name='" + name + '\'' +
                    '}';


        }

        public Ship returnShip(){
            return Ship.this;
        }

    }
}
