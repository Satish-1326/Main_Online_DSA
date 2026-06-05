public class Duplicate_Every_Chae {
    public static void main(String[] args){
        String s =  "abc";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}
