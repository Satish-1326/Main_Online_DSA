public class Leetcode_2180_Count_Integers_With_Even_Digit_Sum {
    public static void main(String[] args){
        int num = 30;
        System.out.println(countEven(num));
    }
    public static int countEven(int num){
        int count = 0;

        if(num < 10){
            for (int i = 1; i <= num; i++) {
                if(i%2 == 0){
                    count++;
                }
            }
            return count;
        }

        for (int i = 1; i <= num ; i++) {
            int numb = i;
            int sum = 0;
            while (numb != 0){
                int digit = numb % 10;
                numb = numb/10;
                sum += digit;
            }
            if(sum % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
