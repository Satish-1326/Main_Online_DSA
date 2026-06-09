public class Leetcode_709_To_Lower_Case {
    public static void main(String[] args){
        String s = "Hello";
        String ans = Solution709(s);
        System.out.println(ans);
    }
    public static String Solution709(String s){
        String ans ="";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ans += (char)(ch + 32);
            }else{
                ans += ch;
            }
        }
        return ans;
    }
}
