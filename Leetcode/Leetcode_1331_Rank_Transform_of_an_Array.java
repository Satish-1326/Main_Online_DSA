import java.util.Arrays;
import java.util.HashMap;

public class Leetcode_1331_Rank_Transform_of_an_Array {
    public static void main(String[] args){
        int [] arr = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int [] arr){
        int [] sorted = arr.clone();

        Arrays.sort(sorted);

        HashMap<Integer , Integer> map = new HashMap<>();
        int rank = 1;

        for(int num : sorted){
            if(!map.containsKey(num)){
                map.put(num,rank);
                rank++;
            }
        }

        int [] ans = new int[arr.length];
        for(int i = 0 ; i < arr.length; i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}
