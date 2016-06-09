package week3.day2;


public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 6, 99, 99, 7, 7};
        int sum = sum67(array);
        System.out.println(sum);
    }

    private static int sum67(int[] array) {
        if(array.length == 0){
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 6){
                while (array[i] != 7){
                    i++;
                }
                if(i == array.length) return sum;
                i++;
            }
            sum += array[i];
        }
        return sum;
    }
}
