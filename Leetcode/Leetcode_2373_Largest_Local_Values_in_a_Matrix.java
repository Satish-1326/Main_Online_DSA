import java.util.Arrays;

public class Leetcode_2373_Largest_Local_Values_in_a_Matrix {
    public static void main(String[] args){
        int [][] grid = {
                {9,9,8,1},
                {5,6,2,6},
                {8,2,6,4},
                {6,2,2,2}
        };

        System.out.println(Arrays.deepToString(largestLocal(grid)));
    }
    public static int [][] largestLocal(int [][] grid){
        int n = grid.length;

        int [][] ans = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {

                int max = Integer.MIN_VALUE;

                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        max = Math.max(max , grid[k][l]);
                    }
                }
                ans[i][j] = max;
            }
        }
        return ans;
    }
}
