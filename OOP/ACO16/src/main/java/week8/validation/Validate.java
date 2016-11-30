package week8.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by gorobec on 27.11.16.
 */
public class Validate {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,15}");
        Matcher matcher = pattern.matcher("Ann");
        System.out.println(matcher.matches());


        Pattern pattern2 = Pattern.compile(" [a-z]{3} ");
        Matcher matcher2 = pattern2.matcher("nfdjfn kjfd asdfg abc gjfkd fxv dvfd");
        while (matcher2.find()){
            System.out.println(matcher2.group(0));
        }
    }
}
