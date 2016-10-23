package week3.singletone;

/**
 * Created by gorobec on 23.10.16.
 */
public class ThreadSafeSigletoneInsideIf {

    private static ThreadSafeSigletoneInsideIf instance;


    private ThreadSafeSigletoneInsideIf(){

    }

    public static ThreadSafeSigletoneInsideIf getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSigletoneInsideIf.class){
                if(instance == null){
                    instance = new ThreadSafeSigletoneInsideIf();
                }
            }

        }
        return instance;
    }
}
