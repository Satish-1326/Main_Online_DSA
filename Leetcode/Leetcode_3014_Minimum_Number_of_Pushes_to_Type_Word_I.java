public class Leetcode_3014_Minimum_Number_of_Pushes_to_Type_Word_I {
    public static void main(String[] args){
        String word = "abcde";
        System.out.println(minimumPushes(word));
    }
    public static int minimumPushes(String word){
        int ans = 0;

        for (int i = 0; i < word.length(); i++) {
            ans += (i/8)+1;
        }
        return ans;
    }
}
