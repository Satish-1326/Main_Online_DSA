import java.util.*;
public class Leetcode_169_Majority_Element {
    public static void main(String[] args) {
        int[] arr = {3,3,4};
        int count = 0;
        int result = 0;

        HashMap<Integer , Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }
        for(int key : hm.keySet()){
            if(hm.get(key) > count) {
                count = hm.get(key);
                result = key;
            }
        }
        System.out.println("Element who has most frequency : "+result);
    }
}
/*

OUTPUT :

Element who has most frequency : 3

 */

class Leetcode_169_Majority_Element_using_freq{
    public static void main(String[] args){
        int [] arr = {2,2,1,1,1,2,2};

        int ans = 0;
        int result = 0;

        int max = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int [] freq = new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > ans){
                ans = freq[i];
                result = i;
            }
        }
        System.out.println(result);
    }
}


class Leetcode_169_Majority_Element_using_for_loop{
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        int result = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > ans){
                ans = count;
                result = arr[i];
            }
        }
        System.out.println("Maximum freq elemenet in the array: "+result);
    }
}
/*

OUTPUT :

Maximum freq elemenet in the array: 2

 */
