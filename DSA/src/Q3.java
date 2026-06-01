import java.util.HashMap;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4};

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        for (int key : hm.keySet()) {
            System.out.println(key + " => " + hm.get(key));
        }
    }
}
