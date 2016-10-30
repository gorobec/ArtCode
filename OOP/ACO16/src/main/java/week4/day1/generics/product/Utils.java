package week4.day1.generics.product;

import java.util.List;

/**
 * Created by gorobec on 29.10.16.
 */
public class Utils {

    public static <T extends Product> boolean find(List<T> list, T p){
        return false;
    }

    public static void copy(List<? extends Product> src, List<? super Product> dest){
        for (Product product : src) {
            dest.add(product);
        }
    }
}
