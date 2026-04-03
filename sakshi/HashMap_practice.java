// finding first unique charachter present in the string
// First Approach : Using for loop
import java.util.*;
class Unique_using_for{
    public static void main(String[] args){
        String str = "apple";

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            int count = 0;
            for(int j = 0 ; j < str.length() ; j++){
                if(ch == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("First unique charater in a string is : "+ch);
                break;
            }
        }
    }
}
/*
OUTPUT :
        First unique charater in a string is : a
 */



// Approach second : Using Frequncy Array
class unique_using_freq{
    public static void main(String[] args){
        String str = "apple";
        int [] freq = new int[26];

        for(int i = 0 ; i < str.length() ; i++){
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0 ; i < freq.length ; i++){
            if(freq[i] == 1){
                char ch = (char)(i +'a');
                System.out.println("First unique character from string : "+ch + " : " + freq[i]);
                break;
            }
        }
    }
}

/*
OUTPUT :
        First unique character from string : a : 1
*/


// Approach third : Using HashMap
class unique_using_hash_third{
    public static void main(String[] args){
        String str = "apple";

        HashMap<Character , Integer>hm = new HashMap<>();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            hm.put(ch , hm.getOrDefault(ch , 0)+1);
        }

        for(Character key : hm.keySet()){
            if(hm.get(key) == 1){
                System.out.println("First unique from string : "+key + " : "+ hm.get(key));
                break;
            }
        }
    }
}
/*
OUTPUT :

        First unique from string : a : 1

 */
















