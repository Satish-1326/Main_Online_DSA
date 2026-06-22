public class Leetcode_1189_Maximum_Number_of_Balloons {
    public static void main(String[] args){
        String text = "nlaebolko";
        System.out.println(maxNumberOfBalloons(text));
    }
    public static int maxNumberOfBalloons(String text) {
        int[] cnt = new int[26];

        for (char c : text.toCharArray()) {
            cnt[c - 'a']++;
        }

        int ans = cnt['b' - 'a'];
        ans = Math.min(ans, cnt['a' - 'a']);
        ans = Math.min(ans, cnt['l' - 'a'] / 2);
        ans = Math.min(ans, cnt['o' - 'a'] / 2);
        ans = Math.min(ans, cnt['n' - 'a']);

        return ans;
    }
}
