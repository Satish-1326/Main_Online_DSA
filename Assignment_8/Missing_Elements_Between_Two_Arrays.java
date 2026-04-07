// Elements present in arr1 but missing in arr2


//1st Approach => Broot force

import java.util.*;
public class Missing_Elements_Between_Two_Arrays {
    public static void main(String[] args){
        int [] arr1 = {1,1,2,2,2,3,7};
        int [] arr2 = {1,1,2,2,2,3};

        int arr1_sum = 0;
        int arr2_sum = 0;

        for (int i = 0; i < arr1.length; i++) {
         arr1_sum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2_sum += arr2[i];
        }

        int result = arr1_sum - arr2_sum;

        System.out.println("Elements present in arr1 but missing in arr2 : "+result);
    }
}

/*

OUTPUT :

Elements present in arr1 but missing in arr2 : 7

 */


// 2nd Approach => Using Frequency Array
class Missing_Elements_Between_Two_Arrays_using_freq_array{
    public static void main(String[] args){
        int [] arr1 = {1,1,2,2,2,3,7};
        int [] arr2 = {1,1,2,2,2,3};

        int max = 0 ;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] > max){
                max = arr1[i];
            }
        }
        int [] freq = new int[max+1];

        for (int i = 0 ; i < arr1.length ; i++){
            freq[arr1[i]]++;
        }
        for (int i = 0; i < arr2.length; i++) {
            freq[arr2[i]]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0){
                System.out.println("present in arr1 but missing in arr2 : "+i);
            }
        }
    }
}

/*

OUTPUT :

present in arr1 but missing in arr2 : 7

*/


// 3rd Approach => Using HashMap

class Missing_Elements_Between_two_Arrays_using_hash{
    public static void main(String[] args){
        int [] arr1 = {1,1,2,2,2,3,7};
        int [] arr2 = {1,1,2,2,2,3};

        HashMap<Integer , Integer> hm = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            hm.put(arr1[i] , hm.getOrDefault(arr1[i] , 0)+1);
        }
        for (int i = 0; i < arr2.length; i++) {
            hm.put(arr2[i] , hm.getOrDefault(arr2[i] , 0)-1);
        }

        for (int key : hm.keySet()){
            if(hm.get(key) > 0){
                System.out.println("Elements present in arr1 but missing in arr2 : "+key);
            }
        }
    }
}

/*

OUTPUT :

Elements present in arr1 but missing in arr2 : 7

 */