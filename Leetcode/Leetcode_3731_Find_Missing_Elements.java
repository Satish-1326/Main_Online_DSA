import java.util.ArrayList;
import java.util.List;

public class Leetcode_3731_Find_Missing_Elements {
    public static void main(String[] args){
        int [] arr = {5,1};

        List<Integer> result = Solution3731(arr);
        System.out.println(result);
    }
    public static List<Integer> Solution3731(int [] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        boolean [] flag = new boolean[101];

        for(int num : arr){
            min = Math.min(min , num);
            max = Math.max(max , num);
            flag[num] = true;
        }

        List<Integer> al = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if(!flag[i]){
                al.add(i);
            }
        }
        return al;
    }
}
