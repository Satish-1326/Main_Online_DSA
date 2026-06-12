public class Leetcode_3945_Digit_Frequency_Score {
    public static void main(String[] args){
        int n = 122;
        int sum = 0;

        while (n != 0){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
