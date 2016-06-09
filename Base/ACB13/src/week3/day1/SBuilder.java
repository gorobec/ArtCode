package week3.day1;

/**
 * Created by gorobec on 30.01.16.
 */
public class SBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" I am");
        sb.append(" 26");
        sb.append(" years");
        sb.append(" old");
        String s = sb.toString();
        System.out.println(s);
        StringBuilder stringBuilder = new StringBuilder(s);

    }
}
