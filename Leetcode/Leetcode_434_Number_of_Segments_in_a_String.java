public class Leetcode_434_Number_of_Segments_in_a_String {
    public static void main(String[] args){
        String s = "Hello, my name is John";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')){
                count++;
            }
        }
        System.out.println(count);
    }
}
