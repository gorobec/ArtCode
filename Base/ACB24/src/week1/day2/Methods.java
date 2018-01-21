package week1.day2;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Methods {
    public static void main(String[] args) {
        int[] num = ArrayUtils.generateArray(10);

        System.out.println(num);

        ArrayUtils.printArray(num);

        System.out.println(Arrays.toString(num));


    }



}
