package week3.singletone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by gorobec on 23.10.16.
 */
public class TestSingl {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Singletone singletone = Singletone.getInstance();
        Singletone singletone2 = Singletone.getInstance();



        for (Constructor constructor : Singletone.class.getDeclaredConstructors()){
            constructor.setAccessible(true);
            Singletone singletone1 = (Singletone) constructor.newInstance();
            System.out.println(singletone1.hashCode());

        }

        System.out.println(singletone.hashCode());
        System.out.println(singletone2.hashCode());


    }
}
