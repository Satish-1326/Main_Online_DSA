import java.util.Arrays;

public class Leetcode_3467_Transform_Array_by_Parity {
    public static void main(String[] args){
        int [] arr = {4,3,2,1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] <= arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
