public class Leetcode_3622_Check_Divisibility_by_Digit_Sum_and_Product {
    public static void main(String[] args){
        System.out.println(checkDivisibility(99));
    }
    public static boolean checkDivisibility(int n){
        int digit_sum = 0;
        int product_sum = 1;

        int temp = n;
        while (temp != 0){
            int digit = temp % 10;
            digit_sum += digit;
            product_sum *= digit;
            temp /= 10;
        }
        if(n%(digit_sum + product_sum) == 0){
            return true;
        }
        return false;
    }
}
