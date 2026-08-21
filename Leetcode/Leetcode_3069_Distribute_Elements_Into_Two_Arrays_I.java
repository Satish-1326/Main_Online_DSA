import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_3069_Distribute_Elements_Into_Two_Arrays_I {
    public static void main(String[] args){
        int [] arr = {2,1,3};
        System.out.println(Arrays.toString(resultArray(arr)));
    }
    public static int [] resultArray(int [] nums){
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {

            int last1 = arr1.get(arr1.size() - 1);
            int last2 = arr2.get(arr2.size() - 1);

            if(last1 > last2){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }
        int [] result = new int[nums.length];
        int index = 0;
        for(int x : arr1){
            result[index++] = x;
        }
        for(int x : arr2){
            result[index++] = x;
        }

        return result;
    }
}
