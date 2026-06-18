import java.util.*;
public class Leetcode_3614_Process_String_with_Special_Operations_II {
    public static void main(String[] args){
        String s = "z*#";
        int k = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                sb.append(ch);
            }
            else if(ch == '#'){
                sb.append(sb);
            }
            else if(ch == '%'){
                sb.reverse();
            }
            else if(ch == '*'){
                sb.deleteCharAt(sb.length()-1);
            }
        }

        char ch = '.';
        for (int i = 0; i < sb.length(); i++) {
            if(i == k){
                ch = sb.charAt(i);
            }
        }

        System.out.println(ch);
    }
}

class Leetcode_3614_Process_String_with_Special_Operations_II_app_sec{
    public static void main(String[] args){
        String s = "a#b%*";
        char result = processStr(s,1);
        System.out.println(result);
    }
    public static char processStr(String s , long k){
        int n = s.length();
        long L = 0;
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                if(L > 0){
                    L--;
                }
            }
            if(ch == '%'){
                continue;
            }
            if(ch == '#'){
                L *= 2;
            }
            else{
                L++;
            }
        }

        if(k >= L){
            return '.';
        }

        char [] p = s.toCharArray();
        for (int i = n-1; i >= 0 ; i--) {
            if(p[i] == '*'){
                L++;
            }
            else if(p[i] == '%'){
                // L madhe kahi change nahi simpli reverse honar
                k = L-k-1;
            }
            else if(p[i] == '#'){
                L = L /2;
                k = (k >= L) ? k-L : k;
            }
            else{
                L--;
            }
            if(L == k){
                return p[i];
            }
        }
        return '.';
    }
}
