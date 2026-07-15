import java.util.Arrays;

public class Leetcode_922_Sort_Array_By_Parity_II {
    public static void main(String[] args){
        int [] arr = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }
    public static int[] sortArrayByParityII(int [] arr){
        for (int i = 0; i < arr.length; i+= 2) {
            for (int j = 1; j < arr.length; j+= 2) {
                if(i % 2 == 0 && arr[i] % 2 != 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
