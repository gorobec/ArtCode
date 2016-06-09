package coddingbat.array1;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1};
        boolean answer = sameFirstLast(array);
        System.out.println(answer);
    }

    public static boolean sameFirstLast(int[] nums) {
        if(nums.length < 1)
            return false;
        return nums[0] == nums[nums.length - 1];
    }
}
