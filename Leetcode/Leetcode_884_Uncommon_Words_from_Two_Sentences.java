import java.util.ArrayList;
import java.util.HashMap;

public class Leetcode_884_Uncommon_Words_from_Two_Sentences {
    public static void main(String[] args){
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        String [] result = uncommonFromSentences(s1,s2);
        for(String word : result){
            System.out.print(word+" ");
        }
    }

    public static String[] uncommonFromSentences(String s1, String s2){

        HashMap<String , Integer> hm = new HashMap<>();
        for(String word : s1.split(" ")){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        for(String word : s2.split(" ")){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }

        ArrayList<String> al = new ArrayList<>();
        for(String word : hm.keySet()){
            if(hm.get(word) == 1){
                al.add(word);
            }
        }
        return al.toArray(new String[0]);
    }
}
