package week3.day2.interfaces;


public class TestInterfaces {
    public static void main(String[] args) {
        Ocean atlantic = new Ocean();
        Swimmable shark = new Shark();
        Duck duck = new Duck();
        atlantic.doAction(shark);
        atlantic.doAction(duck);
        Flyable butterfly = new Butterfly();
        Sky sky = new Sky();
        sky.doAction(butterfly);
        Walkable walkable = new Ant();
        Road road = new Road();
        road.doAction(walkable);
        road.doAction(duck);
        sky.doAction(duck);

    }
}
