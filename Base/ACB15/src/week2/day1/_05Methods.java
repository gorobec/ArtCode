package week2.day1;

import utils.ArrayUtils;

/**
 * Created by gorobec on 16.04.16.
 */
public class _05Methods {
    public static void main(String[] args) {
        int[] nums = ArrayUtils.createAndFillArray(15);

//        public static <return type> <name>(<value type><input value>){
//
//          return <something>;
//         }
        String[] array = {"dd", "ddd"};
        ArrayUtils.printArray(array);
        ArrayUtils.printArray(nums);

        int[] randomArray = ArrayUtils.createAndFillRandomArray(10, 6, 13);
        ArrayUtils.printArray(randomArray);
    }
}
