public class Leetcode_3895_Count_Digit_Appearances {
    public static void main(String[] args){
        int [] arr = {12,54,32,22};
        int result = Solution3895(arr , 2);
        System.out.println(result);
    }
    public static int Solution3895(int [] arr , int key){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while (num != 0){
                int digit = num % 10;
                if(digit == key){
                    count++;
                }
                num = num / 10;
            }
        }
        return count;
    }
}
