package sorts;

/**
 * Created by gorobec on 13.11.16.
 */
public class Dima {
    public static int[] mergeSort(int array[]){

        if(array.length > 1){

            int elementsInA1 = array.length/2;

            int elementsInA2 = elementsInA1;

            if((array.length % 2) == 1) {
                elementsInA2 += 1;
            }
            int arr1[] = new int[elementsInA1];
            int arr2[] = new int[elementsInA2];

            System.arraycopy(array, 0, arr1, 0, elementsInA1);
            System.arraycopy(array, elementsInA1, arr2, 0, elementsInA1);

            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);

            int i = 0;
            int j = 0;
            int k = 0;

            while(arr1.length != j && arr2.length != k)
            {
                if(arr1[j] < arr2[k])
                {
                    array[i] = arr1[j];
                    i++;
                    j++;
                }
                else
                {
                    array[i] = arr2[k];
                    i++;
                    k++;
                }
            }
            while(arr1.length != j)
            {
                array[i] = arr1[j];
                i++;
                j++;
            }
            while(arr2.length != k)
            {
                array[i] = arr2[k];
                i++;
                k++;
            }
        }
        return array;
    }

}
