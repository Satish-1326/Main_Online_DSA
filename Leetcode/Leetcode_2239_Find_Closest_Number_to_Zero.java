public class Leetcode_2239_Find_Closest_Number_to_Zero {
    public static void main(String[] args){
        int [] nums = {-4,-2,1,4,8};
        System.out.println(findClosestNumber(nums));
    }
    public static int findClosestNumber(int [] nums){
        int ans = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if(Math.abs(nums[i]) < Math.abs(ans) || (Math.abs(nums[i]) == Math.abs(ans) && nums[i] > ans)){
                ans = nums[i];
            }
        }
        return ans;
    }
}
