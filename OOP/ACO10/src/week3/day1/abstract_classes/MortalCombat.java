package week3.day1.abstract_classes;


public class MortalCombat {
    public static void main(String[] args) throws InterruptedException {
        Fighter one = new Subzero("Subzero", 100, 20);
        Fighter two = new LuckKang("Lucang", 100, 10, 5);

        Arena.startFight(one, two);
    }
}
