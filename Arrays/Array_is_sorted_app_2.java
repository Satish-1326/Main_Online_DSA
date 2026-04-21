import java.util.TreeMap;
import java.util.*;

public class Array_is_sorted_app_2 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 10};
        boolean result = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        System.out.println("Array is sorded : " + result);
    }
}

/*

OUTPUT :

Array is sorded : true

*/


class merge_using_loop{
    public static void main(String[] args){
        int [] arr = {1,2,3};
        int [] arr1 = {3,4,5,2,3};

        int [] merge = new int[arr.length + arr1.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            merge[index] = arr[i];
            index++;
        }
        for (int i = 0; i < arr1.length; i++) {
            merge[index] = arr1[i];
            index++;
        }

        Arrays.sort(merge);

        System.out.print("Sorted array : ");
        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i]+" ");
        }
    }
}

/*

OUTPUT :

Sorted array : 1 2 2 3 3 3 4 5

 */
