package week1.day2;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Switch {
    public static void main(String[] args) {
        int month = 15;

        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
