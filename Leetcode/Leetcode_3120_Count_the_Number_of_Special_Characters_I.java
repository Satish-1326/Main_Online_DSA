public class Leetcode_3120_Count_the_Number_of_Special_Characters_I {
    public static void main(String[] args){
        String s = "aaAbcBC";

        boolean [] big = new boolean[26];
        boolean [] small = new boolean[26];

        int count = 0;

        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z')){
                big[ch - 'A'] = true;
            }else if(ch >= 'a' && ch <= 'z'){
                small[ch - 'a'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(small[i] && big[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
