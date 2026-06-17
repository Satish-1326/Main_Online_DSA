public class Leetcode_917_Reverse_Only_Letters {
    public static void main(String[] args){
        String s = "ab-cd";

        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = s.length()-1;
        while (start < end){
            while (start < end && !Character.isLetter(sb.charAt(start))){
                start++;
            }
            while (start < end && !Character.isLetter(sb.charAt(end))){
                end--;
            }
            char ch = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,ch);
            start++;
            end--;
        }
        System.out.println(sb.toString());
    }
}
