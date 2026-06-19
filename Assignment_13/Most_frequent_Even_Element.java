import java.util.ArrayList;
import java.util.HashMap;

public class Most_frequent_Even_Element {
    public static void main(String[] args){
        int [] nums = {0,1,2,2,4,4,1};
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0)+1);
        }
        int maxFreq = 0;
        int ans = -1;

        for(int key : hm.keySet()){
            if(key % 2 == 0){
                int freq = hm.get(key);

                if(freq > maxFreq){
                    maxFreq = freq;
                    ans = key;
                }
                else if(freq == maxFreq && key < ans){
                    ans = key;
                }
            }
        }
        System.out.println(ans);
    }
}

