import java.util.*;

public class Leetcode_692_Top_K_Frequent_Words {
    public static void main(String[] args){
        String [] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};

        System.out.println(topKFrequent(words , 2));
    }
    public static List<String> topKFrequent(String [] words , int k){

        HashMap<String , Integer> map = new HashMap<>();

        for(String word : words){
            map.put(word , map.getOrDefault(word , 0)+1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>(
                (a,b) -> {
                    if(map.get(a) != map.get(b)){
                        return map.get(b) - map.get(a);
                    }
                    return a.compareTo(b);
                }
        );

        for(String word : map.keySet()){
            pq.offer(word);
        }
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            ans.add(pq.poll());
        }
        return ans;
    }
}
