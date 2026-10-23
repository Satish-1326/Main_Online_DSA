public class Leetcode_3644_Maximum_K_to_Sort_a_Permutation {
    public static void main(String[] args){
        int [] nums = {0,3,2,1};

        System.out.println(sortPermutation(nums));
    }
    public static int sortPermutation(int [] nums){
        int ans = -1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i){
                ans &= nums[i];
            }
        }
        return ans == -1 ? 0 : ans;
    }
}
