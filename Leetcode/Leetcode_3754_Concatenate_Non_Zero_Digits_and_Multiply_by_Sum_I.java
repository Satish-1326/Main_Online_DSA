public class Leetcode_3754_Concatenate_Non_Zero_Digits_and_Multiply_by_Sum_I {
    public static void main(String[] args){
        int n = 1000;
        System.out.println(sumAndMultiply(n));
    }
    public static long sumAndMultiply(int n){
        int sum = 0;

      String str = String.valueOf(n);
      String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != '0'){
                result += ch;
            }
        }
        int num = Integer.parseInt(result);
        int original = num;
        while (num != 0){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }

        return (long)sum*original;
    }
}

class Leetcode_3754_Concatenate_Non_Zero_Digits_and_Multiply_by_Sum_I_app_2{
    public static void main(String[] args){
        int n = 10203004;
        int sum = 0; int number = 0; int temp = n;

        while (temp != 0){
            int digit = temp % 10;

            if(digit != 0){
                sum += digit;
                number = number*10+digit;
            }
            temp = temp / 10;
        }

        int original = 0;

        while (number != 0){
            original = original*10+(number%10);
            number = number / 10;
        }

        System.out.println(sum*original);
    }
}
