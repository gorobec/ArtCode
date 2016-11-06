package week5.nested_classes;

/**
 * Created by gorobec on 05.11.16.
 */
public class ShipTest {
    public static void main(String[] args) {
        Ship.LifeBoat lifeBoat  = new Ship.LifeBoat("Boat");

        Ship.Engine engine = new Ship().new Engine("Engine");

        System.out.println(engine);

        Ship ship = engine.returnShip();

        System.out.println(ship.getEngine() == engine);





    }
}
