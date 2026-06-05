public class LowestElementInString {
    public static void main(String[] args){
        String s = "satish";
        char low = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch < low){
                low = ch;
            }
        }
        System.out.println(low);
    }
}
