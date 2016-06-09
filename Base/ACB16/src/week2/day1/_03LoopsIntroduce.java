package week2.day1;

/**
 * Created by gorobec on 29.05.16.
 */
public class _03LoopsIntroduce {
    public static void main(String[] args) {
        int[] nums = new int[15];


// step point
        int i = 0;
//        condition -> boolean
        while (i < nums.length) {
            nums[i] = i;
//         step
            i++;
        }


//        step
        int step = 0;
//        condition
        while (step < nums.length) {
            System.out.print(nums[step] + " ");
//            step
            step++;
        }



        /*
        Don't forget about exit(start + step)
        while (true){
            System.out.println("Hello world!");
        }*/


    }
}
