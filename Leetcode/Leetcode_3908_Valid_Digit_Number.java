import java.util.ArrayList;
import java.util.List;

public class Leetcode_3908_Valid_Digit_Number {
    public static void main(String[] args){
        int n = 101;
        System.out.println(validDigit(n,0));
    }
    public static boolean validDigit(int n , int x){
        boolean ans = false;
        int temp = n;
        List<Integer> al = new ArrayList<>();

        while (temp != 0){
            int digit = temp % 10;
            al.add(digit);
            temp = temp / 10;
        }

        for (int i = 0; i < al.size(); i++) {
            if(al.get(i) == x){
                ans = true;
                break;
            }
        }
        if(!ans){
            return false;
        }
        return al.get(al.size() - 1) != x;
    }
}
