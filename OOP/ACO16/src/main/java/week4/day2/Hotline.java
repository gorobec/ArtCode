package week4.day2;

import week4.day1.generics.product.Product;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by gorobec on 30.10.16.
 */
public class Hotline {
    private List<Product> productList = new LinkedList<>();


    public void addProducts(Iterable<Product> iterable){

        Iterator<Product> iterator = iterable.iterator();

        while (iterator.hasNext()){
            productList.add(iterator.next());
        }
    }

    @Override
    public String toString() {
        return "Hotline{" +
                "productList=" + productList +
                '}';
    }
}
