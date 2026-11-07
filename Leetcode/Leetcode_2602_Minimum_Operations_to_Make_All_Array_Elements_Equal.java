import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_2602_Minimum_Operations_to_Make_All_Array_Elements_Equal {
    public static void main(String[] args){
        int [] nums = {3,1,6,8};
        int [] queries = {1,5};

        System.out.println(minOperations(nums,queries));
    }
    public static List<Long> minOperations(int [] nums , int [] queries){
        Arrays.sort(nums);
        int n = nums.length;

        long [] prefix = new long[n+1];
        for (int i = 0; i < n; i++) {
            prefix[i+1] = prefix[i] + nums[i];
        }

        List<Long> ans = new ArrayList<>();

        for(int q : queries){
            int left = 0;
            int right = n;

            while (left < right){
                int mid = left+(right-left)/2;

                if (nums[mid] <= q){
                    left = mid + 1;
                }else {
                    right = mid;
                }
            }
            int idx = left;
            long a = (long) q * idx - prefix[idx];
            long b = prefix[n] - prefix[idx] - (long) q * (n - idx);

            ans.add(a+b);
        }
        return ans;
    }
}
