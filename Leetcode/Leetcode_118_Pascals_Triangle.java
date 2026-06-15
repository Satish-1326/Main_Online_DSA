import java.util.ArrayList;
import java.util.List;

public class Leetcode_118_Pascals_Triangle {
    public static void main(String[] args){
        int n = 5;

        List<List<Integer>> lol = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = 1;
            List<Integer> al = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                al.add(num);
                num = num * (i-j)/(j+1);
            }
            if(!lol.contains(al)) {
                lol.add(al);
            }
        }
        System.out.println(lol);
    }
}
