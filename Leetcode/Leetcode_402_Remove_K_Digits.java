import java.util.Stack;

public class Leetcode_402_Remove_K_Digits {
    public static void main(String[] args){
        String num = "1432219";
        System.out.println(removeKdigits(num,3));
    }
    public static String removeKdigits(String num , int k){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > digit){
                st.pop();
                k--;
            }
            st.push(digit);
        }
        while (k > 0){
            st.pop();
            k--;
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : st){
            ans.append(ch);
        }
        int i = 0;
        while (i < ans.length() && ans.charAt(i) == '0'){
            i++;
        }
        ans = new StringBuilder(ans.substring(i));
        if(ans.length() == 0){
            return "0";
        }
        return ans.toString();
    }
}
