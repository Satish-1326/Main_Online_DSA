public class Leetcode_921_Minimum_Add_to_Make_Parentheses_Valid {
    public static void main(String[] args){

        String s = "())";
        System.out.println(minAddToMakeValid(s));
    }
    public static int minAddToMakeValid(String s){
        int open = 0;
        int add = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                open++;
            }else {
                if(open > 0){
                    open--;
                }else {
                    add++;
                }
            }
        }
        return add+open;
    }
}
