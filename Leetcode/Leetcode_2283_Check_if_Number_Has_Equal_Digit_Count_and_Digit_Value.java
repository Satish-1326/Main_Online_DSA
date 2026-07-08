public class Leetcode_2283_Check_if_Number_Has_Equal_Digit_Count_and_Digit_Value {
    public static void main(String[] args){
        String num = "1210";
        System.out.println(digitCount(num));
    }
    public static boolean digitCount(String num){
        int [] freq = new int[10];
        for (int i = 0; i < num.length(); i++) {
            freq[num.charAt(i) - '0']++;
        }

        for (int i = 0; i < num.length(); i++) {
            int number = num.charAt(i)- '0';

            if(freq[i] != number){
                return false;
            }
        }
        return true;
    }
}
