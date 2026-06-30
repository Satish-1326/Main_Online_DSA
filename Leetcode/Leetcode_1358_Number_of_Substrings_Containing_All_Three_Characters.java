public class Leetcode_1358_Number_of_Substrings_Containing_All_Three_Characters {
    public static void main(String[] args){
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }
    public static int numberOfSubstrings(String s){
        int [] count = new int[3];
        int ans = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0){
                ans += s.length() - right;

                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
    }
}
