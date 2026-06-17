public class Leetcode_345_Reverse_Vowels_of_a_String {
    public static void main(String[] args){
        String s = "IceCreAm";
        String result = Solution345(s);
        System.out.println(result);
    }

    private static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static String Solution345(String s){
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = s.length()-1;
        while (start < end){
            while (start < end && !isVowel(sb.charAt(start))){
                start++;
            }
            while (start < end && !isVowel(sb.charAt(end))){
                end--;
            }
            char ch = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end, ch);
            start++;
            end--;
        }
        return sb.toString();
    }
}
