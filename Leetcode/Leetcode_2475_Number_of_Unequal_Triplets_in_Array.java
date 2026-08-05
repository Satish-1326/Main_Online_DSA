public class Leetcode_2475_Number_of_Unequal_Triplets_in_Array {
    public static void main(String[] args){
        int [] arr = {4,4,2,4,3};
        System.out.println(unequalTriplets(arr));
    }
    public static int unequalTriplets(int [] nums){
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i] != nums[j] && nums[j] != nums[k] && nums[i] != nums[k]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
