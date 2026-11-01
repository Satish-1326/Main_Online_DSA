public class Leetcode_453_Minimum_Moves_to_Equal_Array_Elements {
    public static void main(String[] args){
        int [] nums = {1,2,3};
        System.out.println(minMoves(nums));
    }
    public static int minMoves(int [] nums){
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min , nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] - min;
        }
        return sum;
    }
}
