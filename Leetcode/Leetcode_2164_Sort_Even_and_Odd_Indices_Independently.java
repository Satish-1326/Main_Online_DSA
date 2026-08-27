import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Leetcode_2164_Sort_Even_and_Odd_Indices_Independently {
    public static void main(String[] args){
        int [] arr = {4,1,2,3};
        System.out.println(Arrays.toString(sortEvenOdd(arr)));
    }
    public static int [] sortEvenOdd(int [] nums){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }

        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());

        int e = 0;
        int o = 0;

        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0){
                nums[i] = even.get(e++);
            }else{
                nums[i] = odd.get(o++);
            }
        }
        return nums;
    }
}
