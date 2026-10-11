public class Leetcode_2778_Sum_of_Squares_of_Special_Elements {
    public static void main(String[] args){
        int [] nums = {1,2,3,4};

        System.out.println(sumOfSquares(nums));
    }
    public static int sumOfSquares(int [] nums){
        int n = nums.length;
        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            if(n % i == 0){
                sum += nums[i - 1]*nums[i - 1];
            }
        }
        return sum;
    }
}
