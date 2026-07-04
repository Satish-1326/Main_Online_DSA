public class Leetcode_1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args){
        int [] arr = {8,1,2,2,3};
        int [] ans =smallerNumbersThanCurrent(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int [] smallerNumbersThanCurrent(int [] nums){
        int n = nums.length;
        int [] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            int num = nums[i];

            for (int j = 0; j < n; j++) {
                if(nums[j] < num){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
