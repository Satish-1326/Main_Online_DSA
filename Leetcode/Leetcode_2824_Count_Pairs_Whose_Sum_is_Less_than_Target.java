public class Leetcode_2824_Count_Pairs_Whose_Sum_is_Less_than_Target {
    public static void main(String[] args){
        int [] nums = {-1,1,2,3,1};

        System.out.println(countPairs(nums,2));
    }
    public static int countPairs(int [] nums , int target){
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] < target){
                    count++;
                }
            }
        }
        return count;
    }
}
