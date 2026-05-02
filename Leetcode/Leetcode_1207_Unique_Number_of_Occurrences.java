import java.util.*;

public class Leetcode_1207_Unique_Number_of_Occurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] freq = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        boolean result = true;
        for (int i = 0; i < freq.length - 1; i++) {
            if (freq[i] == freq[i + 1]) {
                result = false;
            }
//            System.out.println(i + " : "+freq[i]);
        }
        System.out.println(result);
    }
}

/*

OUTPUT :

true

****ISSUE => IT WORKS ONLY WHEN THE ALL THE VALUE ARE THE POSITIVE VALUES WHEN VALUE ARE
             NEGATIVE IT FAILS .
             TO SOLVE THIS PROBLEM WE NEED TO USE HASHMAP
 */


class Leetcode_1207_Unique_Number_of_Occurrences_using_hash {
    public static void main(String[] args) {
        int[] arr = {-1, 4, -5, 11, -3, 4, -1, 5, 0, 11, 3};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        boolean result = false;
        for (int key : hm.keySet()) {
            if (hm.get(key) == hm.get(key + 1)) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        System.out.println(result);
    }
}

class Leetcode_1207_Unique_Number_of_Occurrences_using_set {
    public static void main(String[] args) {
        int[] arr = {-1, 4, -5, 11, -3, 4, -1, 5, 0, 11, 3};
        boolean result = true;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for (int val : hm.values()) {
            if (set.contains(val)) {
                result = false;
                break;
            }
            set.add(val);
        }

        System.out.println(result);
    }
}