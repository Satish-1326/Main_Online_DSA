public class Replace_Space {
    public static void main(String[] args){
        String s = "Hello world java";

        for (int i = 0; i < s.length(); i++) {
           s =  s.replace(" " , "-");
        }
        System.out.println(s);
    }
}
