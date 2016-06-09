package codingbat.array1;

import java.util.Arrays;

public class has23TaskTest {


    public static void main(String[] args) {

        /*has23({2, 5}) → true	false	X
        has23({4, 3}) → true	false	X
        has23({4, 5}) → false	false	OK
        has23({2, 2}) → true	false	X
        has23({3, 2}) → true	false	X
        has23({3, 3}) → true	false	X
        has23({7, 7}) → false	false	OK
        has23({3, 9}) → true	false	X
        has23({9, 5}) → false	false	OK
        */

        int[] in1 = {2, 5};
        boolean in1Expected = true;
        boolean actual = MethodContainer.has23(in1);

        System.out.printf("has23(%s)->%b, run -> %b" ,
                Arrays.toString(in1), in1Expected, actual);

    }

}
