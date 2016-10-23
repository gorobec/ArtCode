package week3.singletone;

/**
 * Created by gorobec on 23.10.16.
 */
public class LazySingeltone {

    private static LazySingeltone instance;


    private LazySingeltone(){

    }

    public LazySingeltone getInstance(){
        if(instance == null){
            instance = new LazySingeltone();
        }
        return instance;
    }
}
