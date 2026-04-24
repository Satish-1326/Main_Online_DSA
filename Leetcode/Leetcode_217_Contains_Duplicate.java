import java.util.*;

public class Leetcode_217_Contains_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        boolean result = false;

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] == arr[j]){
//                    result = true;
//                }
//            }
//        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        for (int key : hm.keySet()) {
            if (hm.get(key) > 1) {
                result = true;
            }
        }
        System.out.print("Array contains duplicate : " + result);
    }
}

/*

OUTPUT :

Array contains duplicate : true

 */
