public class Leetcode_3880_Minimum_Absolute_Difference_Between_Two_Values {
    public static void main(String[] args){
        int [] arr = {1,0,0,2,0,1};
        System.out.println(minAbsoluteDifference(arr));
    }
    public static int minAbsoluteDifference(int [] arr){
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == 1 && arr[j] == 2 ||
                    arr[i] == 2 && arr[j] == 1){
                    ans = Math.min(ans,Math.abs(i-j));
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
