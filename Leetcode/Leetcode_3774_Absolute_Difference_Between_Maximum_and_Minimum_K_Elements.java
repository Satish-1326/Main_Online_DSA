import java.util.Arrays;

public class Leetcode_3774_Absolute_Difference_Between_Maximum_and_Minimum_K_Elements {
    public static void main(String[] args){
        int [] arr = {100};
        System.out.println(absDifference(arr,1));
    }
    public static int absDifference(int [] arr , int k){
        int n = arr.length;
        Arrays.sort(arr);

        int kMax = 0;
        int kMin = 0;

        for (int i = 0; i <= k-1; i++) {
            kMin += arr[i];
        }
        for (int i = n-1; i >= n-k ; i--) {
            kMax += arr[i];
        }
        return Math.abs(kMax-kMin);
    }
}
