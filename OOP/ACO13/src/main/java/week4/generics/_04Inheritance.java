package week4.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gorobec on 16.06.16.
 */
public class _04Inheritance {


    public static void main(String[] args) {

        Product product = new Product();
        Product pc = new PC();
        Product mob = new MobilePhone();


        List<Product> productList = new ArrayList<>();
        List<PC> pcList = new ArrayList<>();
        List<MobilePhone> mobList = new ArrayList<>();

        showInfo(new ArrayList<>());

        putProduct(productList, pcList);


    }


    public static<T extends Product> void showInfo(List<T> products){
        for (T product : products) {
            System.out.println(product);
        }
    }

    public static<T> void putProduct(List<? super T> dest, List<? extends T> src){

        for (T pc : src) {
            dest.add(pc);
        }
        T[] array = (T[])dest.toArray();
    }

}
