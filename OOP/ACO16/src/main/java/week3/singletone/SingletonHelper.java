package week3.singletone;

/**
 * Created by gorobec on 23.10.16.
 */
public class SingletonHelper {


    private SingletonHelper(){

    }

    private static class Helper{
        private static final SingletonHelper instance = new SingletonHelper();
    }

    public static SingletonHelper getInstance(){
        return Helper.instance;
    }
}
