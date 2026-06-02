public class Leetcode_3512_Minimum_Operations_to_Make_Array_Sum_Divisible_by_K {
    public static void main(String[] args){
        int [] arr = {3,9,7};
        int sum = 0;
        int k = 5;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum % k);
    }
}
