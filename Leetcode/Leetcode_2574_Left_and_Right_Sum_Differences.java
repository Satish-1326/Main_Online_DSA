public class Leetcode_2574_Left_and_Right_Sum_Differences {
    public static void main(String[] args){
        int [] nums = {10,4,8,3};
        int [] result = leftRightDifference(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int [] leftRightDifference(int [] nums){
        int n = nums.length;
        int [] ans = new int[n];

        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= nums[i];
            ans[i] = Math.abs(leftSum - totalSum);

            leftSum += nums[i];
        }
        return ans;
    }
}
