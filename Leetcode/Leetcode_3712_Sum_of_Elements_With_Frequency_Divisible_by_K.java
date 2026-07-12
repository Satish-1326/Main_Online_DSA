import java.util.HashMap;

public class Leetcode_3712_Sum_of_Elements_With_Frequency_Divisible_by_K {
    public static void main(String[] args){
        int [] arr = {1,2,2,3,3,3,3,4};
        System.out.println(sumDivisibleByK(arr,2));
    }
    public static int sumDivisibleByK(int [] arr , int k){
        int sum = 0 ;
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num , hm.getOrDefault(num , 0)+1);
        }

        for (int i = 0; i < arr.length; i++) {
            if(hm.get(arr[i]) % k == 0){
                sum += arr[i];
            }
        }
        return sum;
    }
}
