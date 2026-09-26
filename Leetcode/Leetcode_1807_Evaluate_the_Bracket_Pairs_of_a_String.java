import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Leetcode_1807_Evaluate_the_Bracket_Pairs_of_a_String {
    public static void main(String[] args){
        String s = "(name)is(age)yearsold";

        List<List<String>> knowledge = new ArrayList<>();

        knowledge.add(Arrays.asList("name", "bob"));
        knowledge.add(Arrays.asList("age", "two"));

        System.out.println(evaluate(s,knowledge));
    }

    public static String evaluate(String s , List<List<String>> knowledge){

        HashMap<String , String> map = new HashMap<>();

        for (List<String> list : knowledge) {
            map.put(list.get(0) , list.get(1));
        }

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < s.length()) {
            if(s.charAt(i) == '(') {
                i++;

                StringBuilder key = new StringBuilder();

                while (s.charAt(i) != ')'){
                    key.append(s.charAt(i));
                    i++;
                }

                if (map.containsKey(key.toString())){
                    ans.append(map.get(key.toString()));
                }else{
                    ans.append("?");
                }
                i++;
            }else{
                ans.append(s.charAt(i));
                i++;
            }
        }
        return ans.toString();
    }
}
