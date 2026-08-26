public class Leetcode_13_Roman_to_Integer {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("III"));
    }
}
class Solution{
        private int value(char ch){
            switch (ch){
                case 'I' : return 1;
                case 'V' : return 5;
                case 'X' : return 10;
                case 'L' : return 50;
                case 'C' : return 100;
                case 'D' : return 500;
                case 'M' : return 1000;
            }
            return 0;
        }

    public int romanToInt(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = value(s.charAt(i));

            if(i+1 < s.length()){
                int next = value(s.charAt(i+1));

                if(current < next){
                    ans -= current;
                }else{
                    ans += current;
                }
            }else{
                ans += current;
            }
         }
        return ans;
    }
}
