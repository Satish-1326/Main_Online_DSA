import java.util.*;

public class Leetcode_219_Contains_Duplicate_II {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3};
        int k = 2;
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && Math.abs(i - j) == k) {
//                    System.out.println(Math.abs(i - j));
                    result = true;
//                    break;
                }
            }
        }
        System.out.println(result);
    }
}

// TLE


class Leetcode_219_Contains_Duplicate_II_hashMap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};

        int k = 2;

        boolean result = false;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , i);
        }

        System.out.println(hm);
    }
}
// TLE

class Leetcode_219_Contains_Duplicate_II_two_pointer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        boolean result = false;
        int k = 3;

        for (int first = 0; first < arr.length; first++) {
            int second = first + 1;
            while (second < arr.length && second - first <= k) {
                if (arr[first] == arr[second]) {
                    result = true;
                }
                second++;
            }
        }
        System.out.println(result);
    }
}
// TLE => 64/65


