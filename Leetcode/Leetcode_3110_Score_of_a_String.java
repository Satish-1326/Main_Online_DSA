public class Leetcode_3110_Score_of_a_String {
    public static void main(String[] args){
        String s = "hello";
        int result = Solution3110(s);
        System.out.println(result);
    }
    public static int Solution3110(String s){
        char [] ans = s.toCharArray();
        int score = 0;
        for (int i = 1; i < ans.length ; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i-1));
        }
        return score;
    }
}
