import java.util.HashMap;

public class Freq_Array_Using_Collection {
    public static void main(String[] args){
        int [] nums = {1,1,0,0,4,4,4,6,7,7,7,7,7,9,-1};

        HashMap<Integer , Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0)+1);
        }

        System.out.println(hm);
    }
}
