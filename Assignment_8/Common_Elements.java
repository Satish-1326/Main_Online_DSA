//Intersection of two arrays

// 1st Approach => Using Broot force
import java.util.*;
public class Common_Elements {
    public static void main(String[] args){
        int [] arr1 = {1,2,2,3};
        int [] arr2 = {2,2,4};

        int min = Math.min(arr1.length, arr2.length);

        int [] temp = new int[min];
        int k = 0;

        boolean [] counted = new boolean[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !counted[j]){
                    temp[k++] = arr1[i];
                    counted[j] = true;
                    break;
                }
            }
        }

        System.out.print("Intersection of two arrays : ");
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] > 0){
                System.out.print(temp[i] +" ");
            }
        }
    }
}

/*

OUTPUT :

Intersection of two arrays : 2 2

 */


// 2nd Approach => Using Frequency Array


class Common_Elements_Using_freq_arr{
    public static void main(String[] args){
        int [] arr1 = {1,2,2,3};
        int [] arr2 = {2,2,4};

        int max = 0 ;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] > max){
                max = arr1[i];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] > max){
                max = arr2[i];
            }
        }

        int [] freq = new int[max+1];

    }
}


// 3rd Approach => Using HashMap

class Common_Element_using_hash{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 2, 4};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            hm.put(arr1[i], hm.getOrDefault(arr1[i], 0) + 1);
        }

        System.out.print("Intersection of two arrays : ");
        int[] result = new int[arr1.length];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (hm.containsKey(arr2[i]) && hm.get(arr2[i]) > 0) {
//                int result = hm.remove(arr1[i]);
//                System.out.println(result);
                    System.out.print(arr2[i] +" ");
//                result[k++] = arr2[i];
                hm.put(arr2[i], hm.get(arr2[i]) - 1);
            }
        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
    }
}

/*


OUTPUT :

Intersection of two arrays : 2 2


 */

