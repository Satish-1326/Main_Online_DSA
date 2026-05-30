public class Leetcode_3300_Minimum_Element_After_Replacement_With_Digit_Sum {
    public static void main(String[] args){
        int [] arr = {999,19,199};

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sum = 0;

            while (num > 0){
                int digit = num % 10;
                sum += digit ;
                num = num / 10;
            }
            arr[i] = sum;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
