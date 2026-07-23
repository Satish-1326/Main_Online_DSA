import java.util.ArrayList;
import java.util.List;

public class Leetcode_3285_Find_Indices_of_Stable_Mountains {
    public static void main(String[] args){
        int [] height = {1,2,3,4,5};
        System.out.println(stableMountains(height,2));
    }
    public static List<Integer> stableMountains(int [] height , int threshold){
        List<Integer> al = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            if(height[i - 1] > threshold){
                al.add(i);
            }
        }
        return al;
    }
}
