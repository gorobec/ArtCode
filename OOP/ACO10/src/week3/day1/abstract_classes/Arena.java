package week3.day1.abstract_classes;


public class Arena {
    public static void startFight(Fighter first, Fighter second) throws InterruptedException {
        while (first.getHealth() > 0 && second.getHealth() > 0){
            first.hit(second);

            if(second.getHealth() <= 0) {
               break;
            }
            second.hit(first);
        }
        if(first.getHealth() > 0)
            System.out.println("First win");
        else
            System.out.println("Second win");
        System.out.println(first);
        System.out.println(second);
    }

}
