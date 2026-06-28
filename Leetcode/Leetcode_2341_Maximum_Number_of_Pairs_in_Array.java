import java.util.HashMap;

public class Leetcode_2341_Maximum_Number_of_Pairs_in_Array {
    public static void main(String[] args){
        int [] arr = {1,3,2,1,3,2,2};
        int [] result = numberOfPairs(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int [] numberOfPairs(int [] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int pairs = 0;
        int left = 0;
        for(int freq : hm.values()){
            pairs += freq / 2;
            left += freq % 2;
        }
        return new int[]{pairs,left};
    }
}
