package week4.day1.generics.product;

/**
 * Created by gorobec on 29.10.16.
 */
public class Product implements Comparable<Product>{
    private String name;

    public Product(){
    }
    public Product(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
