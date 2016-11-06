package week5.exceptions;

/**
 * Created by gorobec on 05.11.16.
 */
public class TestExceptions {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Iside try");
            loop();
            loop2();
        } catch (MyException e){
            System.out.println("Iside catch");
            e.printStackTrace();
            throw new Exception();
        } finally {
            System.out.println("Iside finally");

        }
    }

    private static void loop() throws MyException {
        for (int i = 0; i < 100; i++) {
            if(i == 130){
                throw new MyException("13 is coming");
            }
            System.out.println(i);
        }
    }

    private static void loop2() throws MySecondException {
        int i = 0;
        while (i < 100){
            if(i == 6){
                throw new MySecondException("6 is coming");
            }
            System.out.println(i);
            i++;
        }
    }
}
