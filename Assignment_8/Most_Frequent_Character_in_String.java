import java.util.*;

//Return most frequent character in the string

// 1st Approach => Broot force

public class Most_Frequent_Character_in_String {
    public static void main(String[] args){
        String str = "apple";
        char result = 'a';
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)){
                    count++;
                }
            }
            if(count > max){
                max = count;
                result = ch;
            }
        }
        System.out.println("most frequent character in the string : "+result);
    }
}

/*

OUTPUT :

most frequent character in the string : p

 */



// 2nd Approach => Using Frequency array

class Most_Frequent_Character_in_String_using_freq_array{
    public static void main(String[] args){
        String str = "apple";
        int max = 0;
        char result = 'a';

        int [] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > max){
                max = freq[i];
                result = (char) (i+'a');
            }
        }
        System.out.println("most frequent character in the string : "+result);
    }
}

/*

OUTPUT :

most frequent character in the string : p

 */




// 3rd Approach => Using HashMap

class Most_Frequent_Character_in_String_using_hash{
    public static void main(String[] args){
        String str = "apple";
        char result = 'a';

        HashMap<Character , Integer>hm = new HashMap<>();

        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            hm.put(ch , hm.getOrDefault(ch , 0)+1);
        }

        int max = 0;
        for(char key : hm.keySet()){
            if(hm.get(key) > max ){
                max = hm.get(key);
                result = key;
            }
        }
        System.out.println("most frequent character in the string : "+result);
    }
}

/*

OUTPUT :

most frequent character in the string : p

 */