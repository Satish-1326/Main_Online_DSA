import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_1291_Sequential_Digits {
    public static void main(String[] args){
        System.out.println(sequentialDigits(100,300));
    }
    public static List<Integer> sequentialDigits(int low , int high){
        List<Integer> al = new ArrayList<>();

        for (int start = 1; start <= 9 ; start++) {
            int num = start;
            for (int next = start+1; next <= 9 ; next++) {
                num = num*10+next;

                if(num >= low && num <= high){
                    al.add(num);
                }
            }
        }
        Collections.sort(al);
        return al;
    }
}
