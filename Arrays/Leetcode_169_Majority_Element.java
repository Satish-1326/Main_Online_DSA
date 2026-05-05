// APPROACH => 1 - FOR LOOP

import java.util.*;

public class Leetcode_169_Majority_Element {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int n = arr.length;

        int result = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                result = arr[i];
            }
        }
        System.out.println("Majority Element in array : " + result);
    }
}
/*

OUTPUT :
Majority Element in array : 2

 */

// APPROACH 2 => FREQUENCY ARRAY

class Leetcode_169_Majority_Element_using_freq {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int max = 0;
        int n = arr.length;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] freq = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > n / 2) {
                result = i;
            }
        }
        System.out.println("Majority Element in the array : " + result);
    }
}

/*
OUTPUT :
Majority Element in the array : 2
 */

// APPROACH 3 => HASHMAP - ONE

class Leetcode_169_Majority_Element_using_hashmap {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int n = arr.length;
        int r = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int result = hm.getOrDefault(arr[i], 0) + 1;
            hm.put(arr[i], result);

            if (result > n / 2) {
                r = arr[i];
            }
        }
        System.out.println("Majority element from the array : " + r);
    }
}

/*

OUTPUT :
Majority element from the array : 2

 */

// APPROACH 3 => HASHMAP - TWO

class Leetcode_169_Majority_Element_using_hashmap_two {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int n = arr.length;
        int result = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        for (int key : hm.keySet()) {
            if (hm.get(key) > n / 2) {
                result = key;
            }
        }
        System.out.println("Majority element from the array : " + result);
    }
}
/*

OUTPUT :
Majority element from the array : 2

 */
