public class Leetcode_1572_Matrix_Diagonal_Sum {
    public static void main(String[] args){
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
      int sum = Solution1572(arr);
        System.out.println(sum);
    }
    public static int Solution1572(int [][] arr){
        int sum = 0;
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i + j == n - 1){
                    sum += arr[i][j];
                }
            }
        }
        if(n % 2 == 1){
            sum -= arr[n/2][n/2];
        }
        return sum;
    }
}
