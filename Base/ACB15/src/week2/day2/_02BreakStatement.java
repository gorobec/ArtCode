package week2.day2;

import utils.ArrayUtils;

/**
 * Created by gorobec on 17.04.16.
 */
public class _02BreakStatement {
    public static void main(String[] args) {
        int[] nums = ArrayUtils.createAndFillArray(16);

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 6){
                System.out.println("Inside break");
                break;
            }
            System.out.println(nums[i]);
        }
        System.out.println("Outside for");

    }
}
