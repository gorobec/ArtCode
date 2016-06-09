package week2.day2;

import utils.ArrayUtils;

/**
 * Created by gorobec on 17.04.16.
 */
public class _01BranchingStatements {
    public static void main(String[] args) {
        int[] nums = ArrayUtils.createAndFillArray(16);

       /* for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 6 || nums[i] == 13){

                continue;
            }
            System.out.println(nums[i]);
        }*/
        int i = 0;
        while (i < nums.length) {
            if(nums[i] == 6 || nums[i] == 13) {
                i++;
                continue;
            }
                System.out.println(nums[i]);
            i++;
        }
    }
}
