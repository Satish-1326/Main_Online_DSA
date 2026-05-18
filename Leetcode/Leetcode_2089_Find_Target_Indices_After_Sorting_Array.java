import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_2089_Find_Target_Indices_After_Sorting_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 3};
        int target = 2;

        Arrays.sort(arr);
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
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
