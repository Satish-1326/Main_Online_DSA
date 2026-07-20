public class Leetcode_3918_Sum_of_Primes_Between_Number_and_Its_Reverse {
    public static void main(String[] args){
        int n = 13;
        System.out.println(sumOfPrimesInRange(n));
    }
    public static int sumOfPrimesInRange(int n){
        int temp = n;
        int reverse = 0;
        while (temp != 0){
            int digit = temp % 10;
            reverse = reverse*10+digit;
            temp = temp/10;
        }
        int sum = 0;
        int start = Math.min(n, reverse);
        int end = Math.max(n , reverse);
        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 1; j <= i ; j++) {
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                sum += i;
            }
        }
        return sum;
    }
}
