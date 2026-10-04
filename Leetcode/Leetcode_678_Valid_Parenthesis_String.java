public class Leetcode_678_Valid_Parenthesis_String {
    public static void main(String[] args){
        String s = "(*))";

        System.out.println(checkValidString(s));
    }
    public static boolean checkValidString(String s){
        int low = 0;
        int high = 0;

        for (char ch : s.toCharArray()){
            if(ch == '('){
                low++;
                high++;
            }
            else if(ch == ')'){
                low--;
                high--;
            }else{
                low--;
                high++;
            }
            if(high < 0){
                return false;
            }
            if(low < 0){
                low = 0;
            }
        }
        return low == 0;
    }
}
