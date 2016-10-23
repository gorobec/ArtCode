package week3.singletone;

/**
 * Created by gorobec on 23.10.16.
 */
public class Singletone {

    private static Singletone instance = new Singletone();

    private Singletone(){

    }

    public static Singletone getInstance(){
        return instance;
    }

}
