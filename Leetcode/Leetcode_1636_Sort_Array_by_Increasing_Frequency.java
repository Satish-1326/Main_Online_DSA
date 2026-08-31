import java.util.Arrays;
import java.util.HashMap;

public class Leetcode_1636_Sort_Array_by_Increasing_Frequency {
    public static void main(String[] args){
        int [] nums = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }

    public static int [] frequencySort(int [] nums){
        HashMap<Integer , Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0)+1);
        }

        Integer [] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr,(a,b) -> {

            if(hm.get(a) != hm.get(b)){
                return hm.get(a) - hm.get(b);
            }
            return b - a;
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }
}
