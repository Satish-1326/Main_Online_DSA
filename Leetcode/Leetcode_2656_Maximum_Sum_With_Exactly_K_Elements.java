public class Leetcode_2656_Maximum_Sum_With_Exactly_K_Elements {
    public static void main(String[] args){

        int [] nums = {1,2,3,4,5};
        System.out.println(maximizeSum(nums , 3));
    }
    public static int maximizeSum(int [] nums , int k){
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + max;
            max = max + 1;
        }
        return sum;
    }
}
