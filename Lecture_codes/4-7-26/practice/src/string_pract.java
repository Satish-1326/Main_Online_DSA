public class string_pract {
    public static void main(String[] args){

        // Both Strings refer to a same object
        String s1 = "satish";
        String s2 = "satish";

        System.out.println(System.identityHashCode(s1)); // 41359092
        System.out.println(System.identityHashCode(s2)); // 41359092


        // when create a string using a new keyword it creates a separate object of both String
        String s3 = "Satish";
        String s4 = new String("Satish");

        System.out.println(System.identityHashCode(s3)); // 41359092
        System.out.println(System.identityHashCode(s4)); // 149928006
    }
}
