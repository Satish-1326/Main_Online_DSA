import java.util.PriorityQueue;

public class Leetcode_767_Reorganize_String {
    public static void main(String[] args){
        String s = "aab";

        System.out.println(reorganizeString(s));
    }
    public static String reorganizeString(String s){
        int [] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        PriorityQueue<Character> pq = new PriorityQueue<>(
                (a,b) -> freq[b-'a'] - freq[a-'a']
        );

        for (char ch = 'a'; ch <= 'z' ; ch++) {
            if (freq[ch-'a'] > 0){
                pq.offer(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (pq.size() > 1){

            char first = pq.poll();
            char sec = pq.poll();

            ans.append(first);
            ans.append(sec);

            freq[first-'a']--;
            freq[sec-'a']--;

            if (freq[first-'a'] > 0){
                pq.offer(first);
            }
            if (freq[sec-'a'] > 0){
                pq.offer(sec);
            }
        }

        if(!pq.isEmpty()){
            char last = pq.poll();

            if(freq[last-'a'] > 1){
                return "";
            }
            ans.append(last);
        }
        return ans.toString();
    }
}
