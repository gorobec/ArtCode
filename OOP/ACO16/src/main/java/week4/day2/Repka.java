package week4.day2;

import week4.day1.generics.product.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by gorobec on 30.10.16.
 */
public class Repka implements Iterable<Product>{
    private List<Product> products = new ArrayList<>();


    public boolean addProduct(Product product){
        if(product == null) return false;
        return products.add(product);
    }


    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Iterator<Product> iterator() {
        return new RepkaIterator();
    }

    private class RepkaIterator implements Iterator<Product> {

        private int currentPosition;


        @Override
        public boolean hasNext() {
            return currentPosition < products.size();
        }

        @Override
        public Product next() {
            return products.get(currentPosition++);
        }
    }
}
