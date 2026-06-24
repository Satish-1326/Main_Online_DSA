import java.util.*;
public class Leetcode_2942_Find_Words_Containing_Character {
    public static void main(String[] args){
        String [] words = {"leet","code"};
        System.out.println(findWordsContaining(words, 'e'));
    }
    public static List<Integer> findWordsContaining(String [] words , char x){
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if(words[i].contains(String.valueOf(x))){
                ans.add(i);
            }
        }
        return ans;
    }
}
