import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_905_Sort_Array_By_Parity {
    public static void main(String[] args){
        int [] arr = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
    public static int[] sortArrayByParity(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] % 2 != 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
