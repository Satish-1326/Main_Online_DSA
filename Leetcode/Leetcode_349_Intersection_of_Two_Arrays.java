import java.util.ArrayList;

public class Leetcode_349_Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    if (!al.contains(arr1[i])) {
                        al.add(arr1[i]);
                    }
                }
            }
        }
        int[] result = new int[al.size()];
        int index = 0;
        for (int i = 0; i < al.size(); i++) {
            result[index] = al.get(i);
            index++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
