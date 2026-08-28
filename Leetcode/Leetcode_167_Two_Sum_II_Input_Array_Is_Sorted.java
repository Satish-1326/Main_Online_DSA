import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_167_Two_Sum_II_Input_Array_Is_Sorted {
    public static void main(String[] args){
        int [] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    public static int [] twoSum(int [] arr , int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    return new int[]{i+1, j+1};
                }
            }
        }
        return new int[]{};
    }
}
