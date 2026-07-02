public class Leetcode_3190_Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three {
    public static void main(String[] args){
        int [] arr = {1,2,3,4};
        System.out.println(minimumOperations(arr));
    }
    public static int minimumOperations(int [] arr){
        int count = 0;
        for(int num : arr){
            int rem = num%3;
            count += Math.min(rem,3-rem);
        }
        return count;
    }
}
