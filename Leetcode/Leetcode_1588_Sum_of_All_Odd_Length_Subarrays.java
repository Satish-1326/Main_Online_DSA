public class Leetcode_1588_Sum_of_All_Odd_Length_Subarrays {
    public static void main(String[] args){
        int [] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
    public static int sumOddLengthSubarrays(int [] arr){
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                int length = j - i + 1;
                if(length % 2 == 1){
                    ans += sum;
                }
            }
        }
        return ans;
    }
}
