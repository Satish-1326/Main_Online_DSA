public class Leetcode_1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args){
        int n = 234;
        int result = Solution1281(n);
        System.out.println(result);
    }
    public static int Solution1281(int n){
        int prod = 1;
        int sum = 0;

        while (n != 0){
            int digit = n%10;
            prod *= digit;
            sum += digit;
            n = n / 10;
        }
        return prod-sum;
    }
}
