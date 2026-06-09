public class Leetcode_1672_Richest_Customer_Wealth {
    public static void main(String[] args){
        int [][] arr = {
                {1,2,3},
                {3,2,1}
        };
        int f_res = Solution1672(arr);
        System.out.println(f_res);
    }
    public static int Solution1672(int [][] arr){
        int result = 0;
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            result = Math.max(result , sum);
        }
        return result;
    }
}
