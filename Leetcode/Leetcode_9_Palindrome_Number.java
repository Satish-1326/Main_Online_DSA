public class Leetcode_9_Palindrome_Number {
    public static void main(String[] args){
        int num = -121;
        boolean result = Solution9(num);
        System.out.println("Number is palindrome : "+result);
    }
    public static boolean Solution9(int num){
       int original = num;
       int reverse = 0;

       if(num < 0){
           return false;
       }
       while(num != 0){
           int digit = num % 10;
           reverse = reverse*10+digit;
           num = num/10;
       }

       if(original == reverse){
           return true;
       }
       return false;
    }
}

/*

OUTPUT :

Number is palindrome : false

 */
