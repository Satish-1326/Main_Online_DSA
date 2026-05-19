public class Leetcode_2535_Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {
    public static void main(String[] args){
        int [] arr = {1,2,3,4};
        int ele_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            ele_sum += arr[i];
        }

        int dig_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while (num != 0){
                int digit = num % 10;
                dig_sum += digit;
                num = num / 10;
            }
        }
        System.out.println(Math.abs(ele_sum - dig_sum));
    }
}
