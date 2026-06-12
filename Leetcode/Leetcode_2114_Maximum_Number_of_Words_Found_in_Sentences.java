public class Leetcode_2114_Maximum_Number_of_Words_Found_in_Sentences {
    public static void main(String[] args){
        String [] sentence = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max = 0;

        for(String s : sentence){
            int count = 1;

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ' '){
                    count++;
                }
            }
            max = Math.max(count,max);
        }
        System.out.println(max);
    }
}
