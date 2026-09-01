import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_3842_Toggle_Light_Bulbs {
    public static void main(String[] args){
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(20);
        al.add(10);

        System.out.println(toggleLightBulbs(al));
    }
    public static List<Integer> toggleLightBulbs(List<Integer> bulbs){
        
        boolean [] arr = new boolean[101];
        
        for(int i = 0 ; i < bulbs.size(); i++){
            arr[bulbs.get(i)] = !arr[bulbs.get(i)];
        }
        
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            if(arr[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}
