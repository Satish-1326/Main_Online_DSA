public class Leetcode_1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box {
    public static void main(String[] args){
        String s = "110";
        int [] result = Solution1769(s);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] Solution1769(String s){
        int n = s.length();
        int [] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int moves = 0;
            for (int j = 0; j < n; j++) {
                if(s.charAt(j) == '1'){
                    moves += Math.abs(i - j);
                }
            }
            ans[i] = moves;
        }
        return ans;
    }
}
