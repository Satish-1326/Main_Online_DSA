import java.util.Arrays;

public class Leetcode_1475_Final_Prices_With_a_Special_Discount_in_a_Shop {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(finalPrices(arr)));
    }
    public static int[] finalPrices(int [] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[j] <= arr[i]){
                    arr[i] = arr[i] - arr[j];
                    break;
                }
            }
        }
        return arr;
    }
}
