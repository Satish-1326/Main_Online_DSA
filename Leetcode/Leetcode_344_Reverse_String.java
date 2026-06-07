public class Leetcode_344_Reverse_String {
    public static void main(String[] args){
        char [] s = {'h','e','l','l','o'};
        Solution344(s);
    }
    public static void Solution344(char [] s){
        int start = 0;
        int end = s.length-1;
        while (start<end){
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;
            end--;
        }
    }
}
