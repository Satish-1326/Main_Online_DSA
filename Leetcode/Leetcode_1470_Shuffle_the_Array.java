import java.util.ArrayList;

public class Leetcode_1470_Shuffle_the_Array {
    public static void main(String[] args){
        int [] arr = {2,5,1,3,4,7};
        int n = 3;

        int [] result = new int[n*2];
        int k = 0;

        int first = 0;
        int sec = n;
        while (first < n){
            result[k++] = arr[first];
            result[k++] = arr[sec];
            first++;
            sec++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
