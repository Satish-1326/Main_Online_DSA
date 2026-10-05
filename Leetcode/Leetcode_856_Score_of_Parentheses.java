import java.util.Stack;

public class Leetcode_856_Score_of_Parentheses {
    public static void main(String[] args){

        String s = "(())";
        System.out.println(scoreOfParentheses(s));
    }
    public static int scoreOfParentheses(String s){
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for(char ch : s.toCharArray()){

            if(ch == '('){
                st.push(0);
            }else{
                int x = st.pop();
                if(x == 0){
                    x = 1;
                }else {

                    x = 2 * x;
                }
                int top = st.pop();
                st.push(top + x);
            }
        }
        return st.pop();
    }
}
