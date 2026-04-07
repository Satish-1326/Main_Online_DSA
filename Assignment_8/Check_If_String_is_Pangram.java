//Contains all characters a–z

// 1st Approach => Broot force
import java.util.*;
public class Check_If_String_is_Pangram {
    public static void main(String [] args){
        String str = "thequickbrownfoxjumpsoverthelazydog";

        for (char ch = 'a' ; ch <= 'z' ; ch++){
            if(str.indexOf(ch) == -1){
                System.out.println("false");
            }
        }
        System.out.println("true");
    }
}

/*

OUTPUT :

true
 */


// 2nd Approach => Using Frequency Array

class Check_If_String_is_Panagram_using_freq_array{
    public static void main(String[] args){
        String str = "thequickbrownfoxjumpsoverthelazydog";
        int [] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0){
                System.out.println("false");
                break;
            }
        }
        System.out.println("true");
    }
}

/*

OUTPUT :

true

 */


// 3rd Approach => Using HashMap

class Check_If_String_is_Panagram_using_hash{
    public static void main(String[] args){
        String str = "thequickbrownfoxjumpsoverthelazydog";
        HashMap<Character , Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            hm.put(ch , hm.getOrDefault(ch , 0 )+1);
        }

        if(hm.size() == 26){
            System.out.println(true);
        }else {
            System.out.println("false");
        }
    }
}

/*

OUTPUT :

true

 */