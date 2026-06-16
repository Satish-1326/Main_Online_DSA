import java.util.Locale;
import java.util.Scanner;

public class String_Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gf name : ");
        String s = sc.nextLine();

        System.out.print("Your gf is :"+s);
    }
}

class Count_Number_of_Vowels{
    public static void main(String[] args){
        String s = "Satish Sakshi";
        int count = 0;


        for (int i = 0; i < s.length(); i++) {
            char ch = s.toLowerCase().charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}

class PalindromeString{
    public static void main(String[] args){
        String s = "markram";

        int start = 0;
        int end = s.length()-1;

        boolean result = true;
        while (start < end){
            if(s.charAt(start) != s.charAt(end)){
                result = false;
                break;
            }
            else {
                start++;
                end--;
            }
        }
        System.out.println(result);
    }
}

class Merge_String{
    public static void main(String[] args){
        String a = "abc";
        String b = "defghi";

        StringBuilder sb = new StringBuilder();
        int red = 0;
        int green = 0;
        int blue = 0;

        while (green < a.length() && blue < b.length()){
            sb.append(a.charAt(green));
            sb.append(b.charAt(blue));
            green++;
            blue++;
        }
        while (green < a.length()){
            sb.append(a.charAt(green));
            green++;
        }
        while (blue < b.length()){
            sb.append(b.charAt(blue));
            blue++;
        }
        System.out.println(sb);
    }
}