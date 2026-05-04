public class Leetcode_7_Reverse_Integer {
    public static void main(String[] args) {
        int num = 123;

        int result = Solution7(num);
        System.out.println("Original Number : "+num);
        System.out.println("Reverse Number : "+result);
    }
    public static int Solution7(int num){
        int reverse = 0;
        int n = num;

        while (n != 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return reverse;
    }
}

/*

OUTPUT :

Original Number : 123
Reverse Number : 321

 */



// STACK OVERFLOW PROBLEM SOLVED
class Leetcode_7_Reverse_Integer_essue_solve{
    public static void main(String[] args){
        int n = 121;
        int result = fun(n);
        System.out.println(result);
    }
    public static int fun(int n){
        int reverse = 0;
        int num = n;
        while (num != 0){
            int digit = num % 10;
            if(digit > Integer.MAX_VALUE / 10 || (digit == Integer.MAX_VALUE/ 10 && digit > 7)){
                return 0;
            }
            if(digit < Integer.MIN_VALUE / 10 || (digit == Integer.MIN_VALUE / 10 && digit < -8)){
                return 0;
            }
            reverse = reverse*10+digit;
            num = num / 10;
        }
        return reverse;
    }
}
