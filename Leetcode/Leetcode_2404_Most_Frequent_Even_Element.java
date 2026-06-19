import java.util.HashMap;

public class Leetcode_2404_Most_Frequent_Even_Element {
    public static void main(String[] args){
        int [] arr = {0,1,2,2,4,4,1};
        System.out.println(mostFrequentEven(arr));
    }
    public static int mostFrequentEven(int [] arr){
        HashMap<Integer , Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0)+1);
        }

        int ans = -1;
        int maxFeeq = 0;

        for(int key : hm.keySet()){
            if(key % 2 == 0){
                int freq = hm.get(key);

                if(freq > maxFeeq){
                    maxFeeq = freq;
                    ans = key;
                }
                else if(freq == maxFeeq && key < ans){
                    ans = key;
                }
            }
        }
        return ans;
    }
}
