public class Remove_cons_char {
    public static void main(String[] args){
        String s = "aabbcddeffgggghhi";

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!res.contains(String.valueOf(ch))){
                res += ch;
            }
        }
        System.out.println(res);
    }
}
