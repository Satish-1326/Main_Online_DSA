public class Leetcode_2520_Count_the_Digits_That_Divide_a_Number {
    public static void main(String[] args) {
        int n = 121;
        int count = 0;
        int original = n;

        while (n != 0){
            int digit = n % 10;
            if(original % digit == 0){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}

/*

OUTPUT :
2

 */
