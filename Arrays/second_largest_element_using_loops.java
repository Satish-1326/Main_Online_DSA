import java.util.*;
public class second_largest_element_using_loops {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 1, 3, 4, 13};
        int f_small = 0;
        int s_small = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > f_small) {
                f_small = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > s_small && arr[i] != f_small) {
                s_small = arr[i];
            }
        }
        System.out.println("Second largest Elements from array : " + s_small);
    }
}

/*

OUTPUT :

__Second Smallest Elements from array : 9

 */
class Demo {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 50, 40};
        int[] arr2 = {50, 20, 40, 10};
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] != arr1[i]) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        int temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

class Demo2{
    public static void main(String[] args){
        int [] arr = {1,1,2,2,2,3,3};
        int n = arr.length;

        HashSet<Integer>set = new HashSet<>();

        int index = 0;

        for (int i = 0; i < n; i++) {
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}