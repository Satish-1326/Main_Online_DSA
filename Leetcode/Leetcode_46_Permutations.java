import java.util.ArrayList;
import java.util.List;

public class Leetcode_46_Permutations {

    public static void main(String [] args) {
        int[] nums = {1, 2, 3};
        List<Integer> al = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        fun(nums , used , al , ans);

        System.out.println(ans);
    }
    public static void fun(int [] nums , boolean [] used , List<Integer>al , List<List<Integer>> ans){

        if(al.size() == nums.length){
            ans.add(new ArrayList<>(al));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i]){
                continue;
            }

            al.add(nums[i]);
            used[i] = true;

            fun(nums , used , al , ans);

            used[i] = false;
            al.remove(al.size()-1);
        }
    }
}
