public class Leetcode_3541_Find_Most_Frequent_Vowel_and_Consonant {
    public static void main(String[] args){
        String s = "successes";

        System.out.println(maxFreqSum(s));
    }
    public static int maxFreqSum(String s){
        int [] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int maxVowel = 0;
        int maxConso = 0;

        for (int i = 0; i < 26; i++) {
            char ch = (char) (i+'a');

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                maxVowel = Math.max(maxVowel , freq[i]);
            }else {
                maxConso = Math.max(maxConso, freq[i]);
            }
        }
        return maxVowel+maxConso;
    }
}
