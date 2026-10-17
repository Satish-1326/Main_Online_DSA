public class Leetcode_172_Factorial_Trailing_Zeroes {
    public static void main(String[] args){
        int n = 5;

        System.out.println(trailingZeroes(n));
    }
    public static int trailingZeroes(int n){
        int count = 0;

        while (n >= 5){
            n = n / 5;
            count = count+n;
        }
        return count;
    }
}
