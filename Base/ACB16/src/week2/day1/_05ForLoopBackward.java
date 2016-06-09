package week2.day1;

/**
 * Created by gorobec on 29.05.16.
 */
public class _05ForLoopBackward {
    public static void main(String[] args) {
        int[] nums = new int[10];


        for (int i = 0, num = nums.length - 1; i < nums.length; i++, num--){
            nums[i] = num;
        }


        for (int i = nums.length - 1; i >= 0; i--){
            System.out.print(nums[i] + " ");
        }
    }
}
