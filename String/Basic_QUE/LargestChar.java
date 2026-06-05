public class LargestChar {
    public static void main(String[] args){
        String s = "abce";

        char max = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch > max){
                max = ch;
            }
        }
        System.out.println(max);
    }
}
