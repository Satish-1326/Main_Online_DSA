public class Leetcode_1254_Number_of_Closed_Islands {
    public static void main(String[] args){
        int [][] grid = {
                {1,1,1,1,1,1,1,0},
                {1,0,0,0,0,1,1,0},
                {1,0,1,0,1,1,1,0},
                {1,0,0,0,0,1,0,1},
                {1,1,1,1,1,1,1,0}
        };

        System.out.println(closedIsland(grid));
    }
    public static int closedIsland(int [][] grid){

        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            dfs(grid , i , 0);
            dfs(grid , i, n-1);
        }
        for (int j = 0; j < n; j++) {
            dfs(grid , 0 , j);
            dfs(grid , m-1, j);
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
    public static void dfs(int [][] grid , int i , int j){
        int m = grid.length;
        int n = grid[0].length;

        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 1){
            return;
        }

        grid[i][j] = 1;

        dfs(grid, i +1 , j); // Down
        dfs(grid , i-1, j); // Up
        dfs(grid , i , j+1); // Right
        dfs(grid , i , j-1); // Left
    }
}
