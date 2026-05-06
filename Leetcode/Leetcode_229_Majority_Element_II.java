import java.util.ArrayList;
import java.util.HashMap;

public class Leetcode_229_Majority_Element_II {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int n = arr.length;

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 3) {
                if (!al.contains(arr[i])) {
                    al.add(arr[i]);
                }
            }
        }
        System.out.println(al);
    }
}
/*

OUTPUT :
[1, 2]

 */

class Leetcode_229_Majority_Element_II_approach_two {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int n = arr.length;

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] freq = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > n / 3) {
                al.add(i);
            }
        }
        System.out.println(al);
    }
}

/*

OUTPUT :
[1, 2]

 */

class Leetcode_229_Majority_Element_II_approach_using_hash {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int n = arr.length;

        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        for (int key : hm.keySet()) {
            if (hm.get(key) > n / 3) {
                al.add(key);
            }
        }
        System.out.println(al);
    }
}
/*

OUTPUT :
[1, 2]

*/

class Leetcode_229_Majority_Element_II_approach_using_hash_two {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int n = arr.length;

        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = hm.getOrDefault(arr[i], 0) + 1;
            hm.put(arr[i], count);
            if (count > n / 3) {
                if (!al.contains(arr[i])) {
                    al.add(arr[i]);
                }
            }
        }
        System.out.println(al);
    }
}

/*

OUTPUT :
[1, 2]

 */
