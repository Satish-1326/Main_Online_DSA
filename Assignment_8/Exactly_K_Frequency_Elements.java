//Print elements that appear exactly K times

// 1st approach => Broot force

import java.util.*;
public class Exactly_K_Frequency_Elements {
    public static void main(String[] args){
        int [] arr = {1,1,2,2,2,3};
        int k = 2;

        for(int i = 0 ; i < arr.length ; i++){
            int count = 0;
            boolean counted = false;
            for(int j = 0 ; j < arr.length; j++){
                if(arr[i] == arr[j] && j < i){
                    counted = true;
                    break;
                }
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == k && !counted){
                System.out.println("elements that appear exactly K times : "+arr[i]);
            }
        }
    }
}

/*

OUTPUT :

elements that appear exactly K times : 1
 */


// 2nd Approach => Using frequency array



class Exactly_K_Frequency_Elements_using_freq_array{
    public static void main(String[] args){
        int [] arr = {1,1,2,2,2,3};
        int k = 2;
        int max = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max =arr[i];
            }
        }

        int [] freq = new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] == k){
                System.out.println("elements that appear exactly K times : "+i);
            }
        }
    }
}

/*

OUTPUT :

elements that appear exactly K times : 1

 */


// 3rd Approach => Using HashMap

class Exactly_K_Frequency_Elements_using_hash{
    public static void main(String[] args){
        int [] arr = {1,1,2,2,2,3};
        int k = 2;

        HashMap<Integer , Integer>hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i] , 0)+1);
        }

        for (int key : hm.keySet()){
            if(hm.get(key) == k){
                System.out.println("elements that appear exactly K times : "+key);
            }
        }
    }
}

/*

OUTPUT:

elements that appear exactly K times : 1
 */
