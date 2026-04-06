//Return array with only distinct elements

// 1st Approach => Using Broot Force

import java.util.*;
public class Remove_Duplicates_from_Array {
    public static void main(String[] args){
        int [] arr = {1,2,2,2,3};
        int k = 0 ;
        int n = arr.length;
        int [] temp = new int[n];

        for (int i = 0; i < arr.length; i++) {
//            boolean duplicate = false;
            int count = 0;
            for (int j = 0; j < n; j++) {
//                if(arr[i] == arr[j]){
//                    duplicate = true;
//                    break;
//                }
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if (count == 1 ){
                temp[k] = arr[i];
                k++;
            }
        }
        System.out.print("array with only distinct elements : ");
        for (int i = 0; i < temp.length; i++) {
//            System.out.println(temp[i]);
            if(temp[i] > 0){
                System.out.print(temp[i]+" ");
            }
        }
    }
}

/*

OUTPUT :

array with only distinct elements : 1 3

 */


// 2nd Approach => Frequency array

class Remove_Deplicates_from_Array_using_freq_array{
    public static void main(String[] args){
        int [] arr = {1,2,2,2,3};
        int max = 0 ;
        int n = arr.length;
        int [] temp = new int[n];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int [] freq = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] == 1){
                temp[k] = i;
                k++;
            }
        }

        System.out.print("array with only distinct elements : ");
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] > 0){
                System.out.print(temp[i]+" ");
            }
        }
    }
}

/*

OUTPUT :

array with only distinct elements : 1 3

 */


// 3rd Approach => Using HashMap

class Remove_Duplicate_Elements_from_array_using_hash{
    public static void main(String[] args){
        int [] arr = {1,2,2,2,3};

        HashMap<Integer , Integer> hm = new HashMap<>();

//        for (int i = 0 ; i < arr.length ; i++){
//            if(!hm.containsKey(arr)){
//                hm.put(arr[i] , 1);
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }

        int [] result = new int[hm.size()];
        int index = 0 ;

        for (int key : hm.keySet()){
//            result[index++] = key;
            if(hm.get(key) == 1){
                result[index++] =key;
            }
        }

        System.out.print("array with only distinct elements : ");
        for (int i = 0 ; i < result.length ; i++){
            if(result[i] > 0){
                System.out.print(result[i]+" ");
            }
        }
    }
}

/*

OUTPUT :

array with only distinct elements : 1 3


 */
