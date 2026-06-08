public class Leetcode_3701_Compute_Alternating_Sum {
    public static void main(String[] args){
        int [] arr = {1,3,5,7};
        int ans = Solution3701(arr);
        System.out.println(ans);
    }
    public static int Solution3701(int [] arr ){
        int eve_sum = 0;
        int odd_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                eve_sum += arr[i];
            }else{
                odd_sum += arr[i];
            }
        }
        int ans = eve_sum - odd_sum;
        return ans;
    }
}
