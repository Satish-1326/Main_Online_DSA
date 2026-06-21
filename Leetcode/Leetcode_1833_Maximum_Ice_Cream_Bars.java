import java.util.Arrays;

public class Leetcode_1833_Maximum_Ice_Cream_Bars {
    public static void main(String[] args){
        int [] arr = {1,3,2,4,1};
        System.out.println(maxIceCream(arr,7));
    }
    public static int maxIceCream(int [] arr , int coins){
        Arrays.sort(arr);

        int curr_prize = 0;
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if(curr_prize + arr[j] <= coins){
                curr_prize += arr[j];
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
