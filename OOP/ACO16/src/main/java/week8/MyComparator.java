package week8;

import java.util.Comparator;

/**
 * Created by gorobec on 27.11.16.
 */
public class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}
