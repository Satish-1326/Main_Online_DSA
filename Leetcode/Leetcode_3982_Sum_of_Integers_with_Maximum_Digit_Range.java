public class Leetcode_3982_Sum_of_Integers_with_Maximum_Digit_Range {
    public static void main(String[] args){
        int [] arr = {5724,111,350};
        System.out.println(maxDigitRange(arr));
    }
    public static int maxDigitRange(int [] arr){
        int result = 0;
        int maxRange = -1;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int temp = num;

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            if(temp == 0){
                max = 0;
                min = 0;
            }
            while(temp != 0){
                int digit = temp%10;
                if(digit > max){
                    max = digit;
                }
                if(digit < min){
                    min = digit;
                }
                temp = temp/10;
            }
            int range = max - min;
            if(range > maxRange){
                maxRange = range;
                result = num;
            } else if (range == maxRange) {
                result += num;
            }
        }
        return result;
    }
}
