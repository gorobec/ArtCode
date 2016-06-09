package utils;

public class ArraySorts {
    public static int[] bubbleSort(int[] array){
        if(array == null || array.length == 0) return array;
        for (int i = array.length - 1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] selectSort(int[] array){
        if(array == null || array.length == 0) return array;
        for (int i = 0; i < array.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[idx]) idx = j;
            }
//            if(array[i] > array[idx]){
                int temp = array[i];
                array[i] = array[idx];
                array[idx] = temp;
//            }
        }
        return array;
    }

    public static int[] insertSort(int[] array){
        if(array == null || array.length == 0) return array;
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            for (int j = i - 1; j >= 0; j--) {
                /*if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                } else break;
*/
                if(tmp < array[j]){
                    array[j + 1] = array[j];
                } else {
                    array[j + 1] = tmp;
                    break;
                }
            }
        }
        return array;
    }
}


