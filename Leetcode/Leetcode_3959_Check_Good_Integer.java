public class Leetcode_3959_Check_Good_Integer {
    public static void main(String[] args){
        System.out.println(checkGoodInteger(100));
    }
    public static boolean checkGoodInteger(int n){
        int squareSum = 1;
        int digitSum = 0;

        while(n != 0){
            int digit = n % 10;
            squareSum += digit*digit;
            digitSum += digit;
            n = n / 10;
        }
        if(squareSum - digitSum >= 50){
            return true;
        }
        return false;
    }
}
