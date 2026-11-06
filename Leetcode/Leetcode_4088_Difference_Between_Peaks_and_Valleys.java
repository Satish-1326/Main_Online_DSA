public class Leetcode_4088_Difference_Between_Peaks_and_Valleys {
    public static void main(String[] args){
        int [] nums = {-5,-6,-1,-2,5,3,2};

        System.out.println(peakValleyDifference(nums));
    }
    public static int peakValleyDifference(int [] nums){
        int n = nums.length;

        int peak = 0;
        int valley = 0;

        for (int i = 0; i < n; i++) {
            if(i > 0 && i < n-1){
                if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                    peak += nums[i];
                }
            }
            if(i > 0 && i < n - 1){
                if(nums[i] < nums[i-1] && nums[i] < nums[i+1]){
                    valley += nums[i];
                }
            }
        }
        return (peak - valley);
    }
}
