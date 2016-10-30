package week4.day1.generics.product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gorobec on 29.10.16.
 */
public class Test {

    public static void main(String[] args) {

        Product product = new Product();

        Camera camera = new Camera();

        Phone phone = new Phone();

        Container<Camera> container = new Container<>();

        container.add(camera);

        List<Product> products = new ArrayList<>();
        List<Camera> cameras = new ArrayList<>();
        List<Phone> phones = new ArrayList<>();

        Utils.find(products, product);
        Utils.find(cameras, camera);

        List<Object> list = new ArrayList<>();

        Utils.copy(cameras, list);
    }



}
