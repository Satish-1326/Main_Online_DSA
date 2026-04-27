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
