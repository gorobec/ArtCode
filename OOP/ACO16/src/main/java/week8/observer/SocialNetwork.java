package week8.observer;

/**
 * Created by gorobec on 26.11.16.
 */
public class SocialNetwork {
    public static void main(String[] args) {
        PublicPage publicPage = new PublicPage();
        CrazyFan fan = new CrazyFan();
        CrazyFan fan2 = new CrazyFan();
        CrazyFan fan3 = new CrazyFan();

        publicPage.addObserver(fan);
        publicPage.addObserver(fan2);
        publicPage.addObserver(fan3);

        publicPage.makePost();

        publicPage.deleteObserver(fan2);

        publicPage.makePost();
    }
}
