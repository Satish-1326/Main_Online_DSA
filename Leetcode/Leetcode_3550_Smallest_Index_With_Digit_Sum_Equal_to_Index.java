public class Leetcode_3550_Smallest_Index_With_Digit_Sum_Equal_to_Index {
    public static void main(String[] args){
        int [] nums = {1,3,2};
        System.out.println(smallestIndex(nums));
    }
    public static int smallestIndex(int [] nums){
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int sum = 0;
            while (num != 0){
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }
            if (sum == i){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
