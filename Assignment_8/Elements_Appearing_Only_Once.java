//Print all unique (non-repeating) elements

// 1st Approach => Broot force
import java.util.*;
public class Elements_Appearing_Only_Once {
    public static void main(String[] args){
        int [] arr = {1,1,2,2,2,3};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean counted = false;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] && j < i){
                    counted = true;
                    break;
                }
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("unique (non-repeating) elements : "+arr[i]);
            }
        }
    }
}

/*

OUTPUT :

unique (non-repeating) elements : 3

 */


// 2nd Approach => Using Frequency Array

class Elements_Appearing_Only_Once_using_freq_array{
    public static void main(String[]args){
        int [] arr = {1,1,2,2,2,3};
        int max = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int [] freq = new int[26];

        for(int i = 0 ; i < arr.length ; i ++){
            freq[arr[i]]++;
        }

        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] == 1){
                System.out.println("unique (non-repeating) elements : "+i);
            }
        }
    }
}

/*

OUTPUT :

unique (non-repeating) elements : 3

*/


// 3rd Approach => Using HashMap

class Elements_Appearing_Only_Once_Using_Hash{
    public static void main(String[]args){
        int [] arr = {1,1,2,2,2,3};
        HashMap<Integer , Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }

        for(int key : hm.keySet()){
            if(hm.get(key) == 1){
                System.out.println("unique (non-repeating) elements : "+key);
            }
        }
    }
}

/*

OUTPUT :

unique (non-repeating) elements : 3

 */
