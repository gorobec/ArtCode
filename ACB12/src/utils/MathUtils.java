package utils;


public class MathUtils {
//                  (void - if nothing to return)
//    public static <return_type><name_verb>(<input_type><input_name>){
//
//              logic

//    return<args>;
// }



    //        (void - if nothing to return)
//    public static <return_type><name_verb>()


    public static double roundToHundrets(double number){
//        logic

        double round = ((int)(number * 100))/100.0;
        return round;
    }

    public static int generateRandomDigits(int min, int max){
        return (int)(Math.random() * (max - min) + min);
    }

}
