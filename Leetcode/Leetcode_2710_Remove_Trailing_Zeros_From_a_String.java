public class Leetcode_2710_Remove_Trailing_Zeros_From_a_String {
    public static void main(String[] args){
        String s = "51230100";

        String result = Solution2710(s);
        System.out.println(result);
    }
    public static String Solution2710(String s){
        StringBuilder sb = new StringBuilder();

        boolean found_zero = false;

        for (int i = s.length()-1; i >= 0 ; i--) {
            if(!(s.charAt(i) == '0')){
                found_zero = true;
            }
            if (found_zero){
                sb.append(s.charAt(i));
            }
        }
        return sb.reverse().toString();
    }
}
