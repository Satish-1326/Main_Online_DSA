import java.util.HashMap;

public class Leetcode_3005_Count_Elements_With_Maximum_Frequency {
    public static void main(String[] args){
        int [] arr = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(arr));
    }
    public static int maxFrequencyElements(int [] arr){
        HashMap<Integer , Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }

        int max = Integer.MIN_VALUE;
        for(int key : hm.keySet()){
            if(hm.get(key) > max){
                max = hm.get(key);
            }
        }
        int result = 0;
        for(int key : hm.keySet()){
            if(hm.get(key) == max){
                result += hm.get(key);
            }
        }
        return result;
    }
}
