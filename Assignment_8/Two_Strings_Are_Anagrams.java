//Q11. Check If Two Strings Are Anagrams

// 1st Approach => Using broot force
import java.util.*;
public class Two_Strings_Are_Anagrams {
    public static void main(String[] args){
        String s1 = "heart";
        String s2 = "earth";

        boolean result = true;
        for (int i = 0; i < s1.length(); i++) {
            boolean fount = true;
            char ch = s1.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                if (ch == s2.charAt(j)){
                    fount = true;
                    break;
                }
            }
            if(!fount){
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}

/*

OUTPUT :
true

 */


// 2nd Approach => Using Frequency Array

class Two_String_Are_Anagrams_using_freq_arr{
    public static void main(String[] args){
        String str1 = "heart";
        String str2 = "earth";

        int [] freq = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            freq[ch - 'a']--;
        }

        boolean result = true;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > 0){
                result = false;
            }
        }
        System.out.println(result);
    }
}

/*

OUTPUT :

true

 */


// 3rd Approach => Using HashMap

class Two_Strings_Are_Anagrams_using_hash{
    public static void main(String[] args){
        String s1 = "heart";
        String s2 = "earth";

        HashMap<Character , Integer>hm = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            hm.put(ch , hm.getOrDefault(ch , 0 )+1);
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            hm.put(ch , hm.getOrDefault(ch , 0 )-1);
        }

        boolean result = true;
        for (char ch : hm.keySet()){
            if(hm.get(ch) != 0){
                result = false;
            }
        }
        System.out.println(result);
    }
}

/*

OUTPUT :

true

 */
