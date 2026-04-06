//Print all elements whose frequency is greater than K
// @Satish dadas

import java.util.*;
public class Frequency_Greater_Than_K {
    public static void main(String[] args) {
        int [] arr = {1,1 , 1,2,2,2,3};
        int k = 2;
//        int result = 0;

        for(int i = 0 ; i < arr.length ; i++){
            boolean counted = false;
            int count = 0 ;
            for(int j = 0 ; j < arr.length ; j++){

                if(arr[i] == arr[j] && j < i){
                    counted = true;
                    break;
                }

                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > k && !counted){
                System.out.println("elements whose frequency is greater than K : "+arr[i]);
//                break;
            }
        }
//        System.out.println("exicuted");
    }
}
/*
OUTPUT :

elements whose frequency is greater than K : 1
elements whose frequency is greater than K : 2

 */


//                      Using Freqeuncy Array

class Frequency_greater_than_k_using_freq_array{
    public static void main(String[] args){
        int [] arr = {1,1,2,2,2,3};

        // k is a given target count or target occurance of every element
        int k = 2;

        // we need to find the max element to create frequency array
        int max = 0 ;

        // we need to find the max from the array using a loop

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        // now we need to create a frequency array of length max+1
        // we taking max+1 beacuse we already learned from a raviraj sir why we need to take like this,

        int [] freq = new int [max+1];

        // now we need to feel this frequency array by using normal array.
        for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i]]++;
        }
        for (int i = 0 ; i < freq.length ; i++){
            if(freq[i] > k){
                System.out.println("elements whose frequency is greater than K : "+i);
            }
        }
    }
}

/*

OUTPUT :
elements whose frequency is greater than K : 2
 */


//                      USING HashMap
class Frequency_greater_than_k_using_hash{
    public static void main(String[] args){
            int [] arr = {1,1,2,2,2,3};
            int k = 2;
            HashMap<Integer , Integer>hm = new HashMap<>();

            for (int i = 0 ; i < arr.length ; i++){
                hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
            }

            for(int key : hm.keySet()){
                if (hm.get(key) > k){
                    System.out.println("elements whose frequency is greater than K : "+key);
                }
            }
        }
}
/*

OUTPUT :

elements whose frequency is greater than K : 2
 */
