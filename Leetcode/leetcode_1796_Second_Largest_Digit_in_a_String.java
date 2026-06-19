public class leetcode_1796_Second_Largest_Digit_in_a_String {
    public static void main(String[] args){
        String s = "dfa12321afd";
        int f_max = -1;
        int s_max = -1;

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                int digit = ch - '0';

                if(digit > f_max){
                    s_max = f_max;
                    f_max = digit;
                }
                else if(digit > s_max && digit != f_max){
                    s_max = digit;
                }
            }
        }
        System.out.println(s_max);
    }
}
