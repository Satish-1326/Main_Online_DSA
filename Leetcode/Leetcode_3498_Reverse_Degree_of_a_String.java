public class Leetcode_3498_Reverse_Degree_of_a_String {
    public static void main(String[] args){
        String s = "abc";

        System.out.println(reverseDegree(s));
    }
    public static int reverseDegree(String s){
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            int reverse = 'z' - ch+1;

            sum = sum + reverse * (i+1);
        }
        return sum;
    }
}
