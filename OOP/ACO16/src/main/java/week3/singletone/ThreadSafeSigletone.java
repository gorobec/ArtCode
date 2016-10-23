package week3.singletone;

/**
 * Created by gorobec on 23.10.16.
 */
public class ThreadSafeSigletone {
    private static ThreadSafeSigletone instance;


    private ThreadSafeSigletone(){

    }

    public static synchronized ThreadSafeSigletone getInstance(){
        if(instance == null){
            instance = new ThreadSafeSigletone();
        }
        return instance;
    }
}
