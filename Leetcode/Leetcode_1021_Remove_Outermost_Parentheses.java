public class Leetcode_1021_Remove_Outermost_Parentheses {
    public static void main(String[] args){

        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                if(count > 0){
                    sb.append('(');
                }
                count++;
            }else{
                count--;

                if (count > 0){
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
}
