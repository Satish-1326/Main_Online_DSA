import java.util.HashMap;

public class Leetcode_contest_Q_1_Unique_Middle_Element {
    public static void main(String[] args){
        int [] nums = {1,2,3};
        System.out.println(isMiddleElementUnique(nums));
    }
    public static boolean isMiddleElementUnique(int[]nums){
        boolean result = true;

        int mid = nums.length/2;

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        return hm.get(nums[mid]) == 1;
    }
}
