import java.util.HashMap;
import java.util.HashSet;

public class Leetcode_3471_Find_the_Largest_Almost_Missing_Integer {
    public static void main(String[] args){
        int [] arr = {3,9,2,1,7};
        System.out.println(largestInteger(arr,3));
    }
    public static int largestInteger(int [] nums, int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i <= nums.length-k; i++) {

            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < i+k ; j++) {
                set.add(nums[j]);
            }

            for (int num : set){
                hm.put(num, hm.getOrDefault(num,0)+1);
            }
        }
        int ans = -1;
        for (int num : hm.keySet()){
            if(hm.get(num) == 1){
                ans = Math.max(ans,num);
            }
        }
        return ans;
    }
}
